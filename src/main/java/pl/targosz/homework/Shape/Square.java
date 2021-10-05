package pl.targosz.homework.Shape;

public class Square extends Shape{
    private double a;
    public Square(double a) {
        this.a=a;
    }

    public Square() {
    }

    @Override
    double getArea() {
        return a*a;
    }

    @Override
    double getPerimeter() {
        return 4*a;
    }
}
