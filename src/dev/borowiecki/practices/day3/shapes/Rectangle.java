package dev.borowiecki.practices.day3.shapes;

public class Rectangle extends Shape {
    private final int a;
    private final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double area() {
        return a*b;
    }

    @Override
    double perimeter() {
        return 2*a + 2*b;
    }
}
