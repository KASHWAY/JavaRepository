
package pl.targosz.homework.CinemaWorkers;

public class Manager extends Employee {
    private int bonus = 500;

    public Manager(int yearOfEmployment, final int bonus) {
        super(yearOfEmployment);
        this.bonus = bonus;
    }

    @Override
    int calculateMonthlySalary() {
        return Payment + 2000 + bonus;
    }

    @Override
    int workDuration() {
        return 2021 - yearOfEmployment;
    }

}
