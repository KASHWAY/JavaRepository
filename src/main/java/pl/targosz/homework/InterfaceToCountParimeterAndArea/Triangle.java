package pl.targosz.homework.InterfaceToCountParimeterAndArea;

public class Triangle implements InterfaceToCountParimeterAndArea {
    double a,b,c,h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override

    public double Area() {
        return a*h/2;
    }

    @Override
    public double Parimeter() {
        return a+b+c;
    }
}
