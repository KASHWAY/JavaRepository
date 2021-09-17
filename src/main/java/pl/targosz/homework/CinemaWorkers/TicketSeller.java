package pl.targosz.homework.CinemaWorkers;

public class TicketSeller extends Employee{
    private int howManyTicketsLeft;
    public TicketSeller(int yearOfEmployment, int TicketsLeft) {
        super(yearOfEmployment);
        this.howManyTicketsLeft=TicketsLeft;
    }

    @Override
    int calculateMonthlySalary() {
        return payment + 1000;
    }

    @Override
    int workDuration() {
        return 2021-yearOfEmployment;
    }
}