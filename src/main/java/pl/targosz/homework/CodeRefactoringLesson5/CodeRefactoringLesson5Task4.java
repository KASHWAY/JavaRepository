package pl.targosz.homework.CodeRefactoringLesson5;

import java.math.BigDecimal;

class Employee {
    private final String name, surname;
    private int age;
    private BigDecimal baseSalary, bonus;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public Employee(String name, String surname, int age, BigDecimal value) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.baseSalary = value;
    }

    public Employee(String name, int age, BigDecimal value1, BigDecimal value2, String surname) {
        this.name = name;
        this.age = age;
        this.baseSalary = value1;
        this.bonus = value2;
        this.surname = surname;
    }

    public String getEmployeeInfo() {
        return "Employee name : " + name + " " + surname;
    }

    public String getEmployeeDetails() {
        return "Employee details : " + name + " " + surname + " is " + age;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public BigDecimal getSalary() {
        return baseSalary;
    }

    public BigDecimal getSalaryAndBonus() {
        return baseSalary.add(bonus);
    }


}
