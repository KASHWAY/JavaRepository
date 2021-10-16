package pl.targosz.homework.Lesson7Task8;

public class WorkerPaymentCalc {
    private final BaseSalary baseSalary;
    private final HowManySaturdays howManySaturdays;
    private static final double SATURDAY_BONUS = 1000;

    public WorkerPaymentCalc(BaseSalary baseSalary, HowManySaturdays howManySaturdays) {
        this.baseSalary = baseSalary;
        this.howManySaturdays = howManySaturdays;
    }

    double calculate(int bonus) {

        return baseSalary.get() + bonus + howManySaturdays.get() * SATURDAY_BONUS;
    }


}
