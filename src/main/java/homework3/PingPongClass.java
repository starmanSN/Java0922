package homework3;

public class PingPongClass {
    
    private final Object lock = new Object();
    private volatile String currentWord;

    public PingPongClass(String word) {
        this.currentWord = word;
    }

    public void writeFirst() {
        synchronized (lock) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (!currentWord.equals("Ping")) {
                        lock.wait();
                    }
                    System.out.print("Ping");
                    currentWord = "Pong";
                    lock.notify();
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    public void writeSecond() {
        synchronized (lock) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (!currentWord.equals("Pong")) {
                        lock.wait();
                    }
                    System.out.print("Pong");
                    currentWord = "Ping";
                    lock.notify();
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
