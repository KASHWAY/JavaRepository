package pl.targosz.homework.Lesson7Task8;

public class WorkerPaymentCalc implements BaseSalary, HowManySaturdays {

    public WorkerPaymentCalc(BaseSalary baseSalary, int bonus, HowManySaturdays howManySaturdays) {
    }


    public int baseSalary(int basePayment) {
        return basePayment;
    }

    public int howManySaturdays(int number) {
        return number;
    }

    public int saturdayBonus(int saturdayBonus, int howManySaturdays) {
        return saturdayBonus;
    }


    public static int paymentCalculator(BaseSalary baseSalary, int bonus,int saturdayBonus, HowManySaturdays howManySaturdays) {
        return baseSalary + bonus + saturdayBonus * howManySaturdays;
    }


}
