package pl.targosz.homework.CinemaWorkers;

public class Main {
    public static void main(String[] args) {

        System.out.println("The base payment is : " + Employee.payment + " dollars.");
        System.out.println(("----------------------------------------"));

        Manager manager = new Manager(2015,1000);
        manager.setName("Hubert");
        manager.setSurname("Targosz");
        manager.calculateMonthlySalary();
        System.out.println("Your manager`s payment is : " + manager.calculateMonthlySalary() + " dollars.");
        System.out.println("Your manager works : " + manager.workDuration() + " years ");

        System.out.println(("----------------------------------------"));

        TicketSeller ticketSeller = new TicketSeller(2018,15);
        ticketSeller.setName("Mateusz");
        ticketSeller.setSurname("Mruwczynski");
        ticketSeller.calculateMonthlySalary();
        System.out.println("Your ticket seller got promoted and gets 1000 more, so his payment is : " + ticketSeller.calculateMonthlySalary() + "dollars");
        System.out.println("Your ticket sellers work duration is : " + ticketSeller.workDuration() + " years");



    }
}