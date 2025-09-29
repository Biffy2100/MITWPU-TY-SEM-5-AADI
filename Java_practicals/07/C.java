class Ascending implements Runnable {

    int threadNo;

    Ascending(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        for (int i = 10; i <= 20; i++) {
            if (i % 2 == 0 && i > 0) {
                try {
                    Thread.sleep(500); // Sleep for 0.5 seconds
                } catch (InterruptedException e) {
                    // Minimal handling: just return
                    return;
                }
            }
            System.out.println(i + " by thread " + threadNo);
        }
    }
}

class Descending implements Runnable {
    int threadNo;

    Descending(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        for (int i = 20; i >= 1; i--) {
            System.out.println(i + " by thread " + threadNo);
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                // Minimal handling: just return
                return;
            }
        }
    }
}

public class C {
    public static void main(String[] args) {
        Ascending asc = new Ascending(1);
        Descending desc = new Descending(2);

        Thread t1 = new Thread(asc);
        Thread t2 = new Thread(desc);

        t1.start();
        t2.start();
    }
}