package pl.targosz.homework.CinemaWorkers;

public abstract class Employee {
    private String name, surname;
    protected int yearOfEmployment;
    protected static int Payment = 3000;

    abstract int calculateMonthlySalary();

    abstract int workDuration();

    public Employee(final int yearOfEmployment) {
        this.yearOfEmployment = yearOfEmployment;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }


}