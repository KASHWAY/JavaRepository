package pl.targosz.homework;

public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double split(double a, double b) {
        return (a / b);
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to calculator!");
        double a=0,b=0;
        System.out.println(add(7,5));
        System.out.println(minus(10.5,5));
        System.out.println(multiplication(15,20));
        System.out.println(split(153.3,10));


    }

}
