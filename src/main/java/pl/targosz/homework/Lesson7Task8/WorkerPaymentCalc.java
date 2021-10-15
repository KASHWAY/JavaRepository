package pl.targosz.homework.Lesson7Task8;

public class WorkerPaymentCalc implements BaseSalary, SaturdayBonus, HowManySaturdays {

    public WorkerPaymentCalc(BaseSalary baseSalary,int bonus, SaturdayBonus saturdayBonus,HowManySaturdays howManySaturdays) {
    }


    public int baseSalary(int basePayment) {
        return basePayment;
    }


    public int saturdayBonus(int saturdayBonus) {
        return saturdayBonus;
    }

    @Override
    public int howManySaturdays(int number) {
        return number;
    }

    public static int paymentCalculator(int baseSalary, int bonus, int saturdayBonus, int howManySaturdays) {
        return baseSalary + bonus + saturdayBonus * howManySaturdays;
    }


}
