package pl.targosz.homework.TextFormatter;


public class Main {
    public static void main(String[] args) {
        ToBigLetters toBigLetters = new ToBigLetters();
        System.out.println(toBigLetters.formatText("Dzieki mentorzy za wyrozumialosc gdy mozg mi sie wylacza"));

        ToSmallLetters toSmallLetters = new ToSmallLetters();
        System.out.println(toSmallLetters.formatText("DZIEKI MENTORZY KOCHAMY WAS"));

    }
}
