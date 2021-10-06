package pl.targosz.homework;

public class ConvertMinutesToSeconds {
    static int ConvertMinutes(int number) {
        return number*60;
    }
    public static void main(String[] args) {


        System.out.println(ConvertMinutes(50));
        System.out.println(ConvertMinutes(120));
        System.out.println(ConvertMinutes(20));

    }
}
