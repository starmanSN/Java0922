package homework1.second;

public class LightWeightCar extends Car implements Movable {

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
}
