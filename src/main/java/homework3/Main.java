package homework3;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        pingPong();
        counter();
    }

    public static void pingPong() {
        PingPongClass app = new PingPongClass("Ping");
        Thread t1 = new Thread(app::writeFirst);
        Thread t2 = new Thread(app::writeSecond);
        t1.start();
        t2.start();
    }

    public static void counter() throws InterruptedException {
        MyCounter counter = new MyCounter();

        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                counter.incrementFirst();
                if (i % 2 == 0) {
                    counter.incrementSecond();
                }
                synchronized (counter) {
                    counter.incrementFirst();
                    counter.incrementSecond();
                }
            }
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(counter);
    }
}
