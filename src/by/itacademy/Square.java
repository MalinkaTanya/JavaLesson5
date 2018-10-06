package by.itacademy;

public class Square extends Figure {
    private double sideA;
    private double area;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    void calculationArea() {
        area = sideA * sideA;
        System.out.println("Площадь квадрата равна " + area);
    }
}
