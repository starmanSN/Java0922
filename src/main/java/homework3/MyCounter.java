package homework3;


public class MyCounter {

    private int firstValue;
    private int secondValue;

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public MyCounter() {
        this.firstValue = 0;
        this.secondValue = 0;
    }

    public MyCounter(int firstValue, int secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public void incrementFirst() {
        synchronized (lock1) {
            this.firstValue++;
        }
    }

    public void incrementSecond() {
        synchronized (lock2) {
            this.secondValue++;
        }
    }

    @Override
    public String toString() {
        return "MyCounter{" +
                "firstValue=" + firstValue +
                ", secondValue=" + secondValue +
                '}';
    }
}
