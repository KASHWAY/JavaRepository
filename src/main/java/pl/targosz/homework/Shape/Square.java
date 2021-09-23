package pl.targosz.homework.Shape;

public class Square extends Shape{
    double a;
    @Override
    double getArea() {
        return a*a;
    }

    @Override
    double getPerimeter() {
        return 4*a;
    }
}
