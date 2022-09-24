package homework1.third;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        triangle.color = "Black";
        triangle.height = 10;
        triangle.width = 5;
        triangle.draw();

        TestClass testClass = new TestClass();
        testClass.test(circle);

    }
}
