class Shared {
    int turn = 1; // 1 for Count, 2 for Tounc
}

class Count implements Runnable {
    Shared shared;

    public Count(Shared shared) {
        this.shared = shared;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10;) {
            synchronized (shared) { 
                if (shared.turn == 1) {
                    for (int j = 0; j < 2 && i <= 10; j++, i++) {
                        System.out.println(i + " by thread 1");
                    }
                    shared.turn = 2;
                    shared.notifyAll();
                } else {
                    try {
                        shared.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }
}

class Tounc implements Runnable {
    Shared shared;

    public Tounc(Shared shared) {
        this.shared = shared;
    }

    @Override
    public void run() {
        for (int i = 10; i >= 1;) {
            synchronized (shared) {
                if (shared.turn == 2) {
                    for (int j = 0; j < 2 && i >= 1; j++, i--) {
                        System.out.println(i + " by thread 2");
                    }
                    shared.turn = 1;
                    shared.notifyAll();
                } else {
                    try {
                        shared.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }
}

public class A {
    public static void main(String[] args) {
        Shared shared = new Shared();
        
        Thread a = new Thread(new Count(shared));
        Thread b = new Thread(new Tounc(shared));

        a.start();
        b.start();
    }
}