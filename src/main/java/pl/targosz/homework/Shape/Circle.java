package pl.targosz.homework.Shape;

public class Circle extends Shape{
    private double r;
    public Circle (double r) {
       this.r=r;
    }

    double getArea() {
        return 3.14*(r*r);
    }

    @Override
    double getPerimeter() {
        return 3.14*2*r;
    }
}
