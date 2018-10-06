package by.itacademy;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double angle;
    private double area;

    public Triangle(double sideA, double sideB, double angle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;
    }

    void calculationArea() {
        area = 0.5 *sideA * sideB * Math.sin(angle);
        System.out.println("Площадь треугольника равна " + area);
    }
}
