package pl.targosz.homework.BillCalculate;

public class BillCalculator {
    public static double calculate(double bill,double servicePayment) {
        return bill+servicePayment;
    }

    private static double calculate() {
        double bill=15000;
        double servicePayment=1500000;
        double discount = 1500;
        return bill+servicePayment-discount;
    }

    private static double calculate(double bill,double servicePayment,double takeOutPayment) {
        return bill+servicePayment+takeOutPayment;
    }
}
