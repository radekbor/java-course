package dev.borowiecki.practices.day3.shapes;

public class Circle extends Shape {

    private final int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    double area() {
        return r*r * Math.PI;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * r;
    }
}
