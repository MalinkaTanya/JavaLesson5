package by.itacademy;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;
    private double area;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    void calculationArea() {
        area = sideA * sideB;
        System.out.println("Площадь прямоугольника равна " + area);
    }
}
