package pl.targosz.homework.Shape;

public class Triangle extends Shape{
    protected double a,b,c,h;
    public Triangle(double a,double b,double c,double h) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.h=h;
    }
    double getArea() {
        return a*h/2;
    }

    @Override
    double getPerimeter() {
        return a+b+c;
    }
}
