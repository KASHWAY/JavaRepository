package pl.targosz.homework.InterfaceToCountParimeterAndArea;

public class Square implements InterfaceToCountParimeterAndArea{
    private double a;
    public Square(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }

    public double parimeter() {
        return 4*a;
    }
}
