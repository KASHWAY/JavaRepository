package pl.targosz.homework.Shape;

public class Triangle extends Shape{
    double a,b,c,h;
    double getArea() {
        return a*h/2;
    }

    @Override
    double getPerimeter() {
        return a+b+c;
    }
}
