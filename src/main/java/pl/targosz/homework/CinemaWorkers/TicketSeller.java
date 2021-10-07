package pl.targosz.homework.CinemaWorkers;

public class TicketSeller extends Employee{
    public TicketSeller(int yearOfEmployment) {
        super(yearOfEmployment);
    }

    @Override
    int calculateMonthlySalary() {
        return PAYMENT + 1000;
    }

    @Override
    int workDuration() {
        return 2021-yearOfEmployment;
    }
}