package by.itacademy;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(2);
        Triangle triangle = new Triangle(2, 5, 30);
        Rectangle rectangle = new Rectangle(2, 5);
        Circle circle = new Circle(10);

        square.calculationArea();
        triangle.calculationArea();
        rectangle.calculationArea();
        circle.calculationArea();
    }
}
