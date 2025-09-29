class Odd implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.println((i + 1) + " by thread 1");

            }
        }
    }
}

class Even implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if ((i + 1) % 2 != 0) {
                System.out.println((i + 1) + " by thread 2");

            }

        }
    }
}

public class B {
    public static void main(String[] args) {

        Odd o = new Odd();
        Even e = new Even();

        Thread osc = new Thread(o);
        Thread eve = new Thread(e);

        osc.start();
        eve.start();
    }
}
