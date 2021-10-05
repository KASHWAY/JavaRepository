package pl.targosz.homework.BillCalculate;

public class BillCalculator {
    private static double calculate(double bill,double servicePayment) {
        return bill+servicePayment;
    }

    protected static double calculate(double bill,double servicePayment, double discount) {
        return bill+servicePayment-discount;
    }

    private static double calculate(protected double bill,protected  double servicePayment,protected double takeOutPayment) {
        return bill+servicePayment+takeOutPayment;
    }
}
