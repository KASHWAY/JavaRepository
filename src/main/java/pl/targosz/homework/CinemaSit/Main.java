package pl.targosz.homework.CinemaSit;

public class Main {
    public static void main(String[] args) {
        CinemaSit cinemasit = new CinemaSit(10,'B',true);
        System.out.println("Your sit number is : " + cinemasit.id);
        System.out.println("Your row is : " + cinemasit.row);
        System.out.println("Is your seat taken ? : " + cinemasit.ifTaken);
    }


}