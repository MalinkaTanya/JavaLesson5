package by.itacademy;

public class Circle extends Figure {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
    }

    void calculationArea() {
        area = Math.PI * Math.sqrt(radius);
        System.out.println("Площадь круга равна " + area);
    }
}
