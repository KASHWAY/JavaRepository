package pl.targosz.homework.InterfaceToCountParimeterAndArea;

public class Square implements InterfaceToCountParimeterAndArea{
    double a;
    public Square(double a) {
        this.a = a;
    }

    @Override
    public double Area() {
        return a*a;
    }

    @Override
    public double Parimeter() {
        return 4*a;
    }
}
