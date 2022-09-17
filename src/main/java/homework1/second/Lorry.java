package homework1.second;


public class Lorry extends Car implements Stoppable, Movable {

    @Override
    protected void start() {
        super.start();
    }

    @Override
    void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        System.out.println("Car is stop");
    }
}
