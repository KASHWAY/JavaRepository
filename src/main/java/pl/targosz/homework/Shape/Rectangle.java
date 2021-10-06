package pl.targosz.homework.Shape;

public class Rectangle extends Square{
    private int a,b;
    public Rectangle (int a,int b) {
        this.a=a;
        this.b=b;
    }
    double getArea() {
        return a*b;
    }

    @Override
    double getPerimeter() {
        return 2*a+2*b;
    }
}
