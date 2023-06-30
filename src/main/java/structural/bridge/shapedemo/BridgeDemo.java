package structural.bridge.shapedemo;

public class BridgeDemo {
    public static void main(String[] args) {
        Color red = new Red();
        Shape square = new Square(red);
        square.applyColor();

        Color green = new Green();
        Shape circle = new Circle(green);
        circle.applyColor();
    }
}
