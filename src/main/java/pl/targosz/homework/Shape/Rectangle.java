package pl.targosz.homework.Shape;

public class Rectangle extends Square{
    int b;
    double getArea() {
        return a*b;
    }

    @Override
    double getPerimeter() {
        return 2*a+2*b;
    }
}
