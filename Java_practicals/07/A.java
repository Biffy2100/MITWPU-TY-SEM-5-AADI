class Count implements Runnable {
    int thread_count;

    public Count() {
        thread_count = 1;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " by thread " + thread_count);
        }
    }
}

class Tounc implements Runnable {
    int thread_count;

    public Tounc() {
        thread_count = 2;
    }

    @Override
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + " by thread " + thread_count);
        }
    }
}

public class A {
    public static void main(String[] args) {
        Count c = new Count();
        Tounc t = new Tounc();

        Thread a = new Thread(c);
        Thread b = new Thread(t);

        a.start();
        b.start();
    }
}