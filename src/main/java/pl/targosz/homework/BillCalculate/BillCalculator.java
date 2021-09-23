package pl.targosz.homework.BillCalculate;

public class BillCalculator {
    public static double calculate(double bill,double servicePayment) {
        return bill+servicePayment;
    }

    public static double calculate(double bill, double servicePayment, double discount) {
        return bill+servicePayment-discount;
    }

    public static double calculate(double bill, double servicePayment, double takeOutPayment) {
        return bill+servicePayment+takeOutPayment;
    }
}
