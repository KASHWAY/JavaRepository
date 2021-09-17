package pl.targosz.homework;

public class NumberCheck {
    static boolean checkMyNumber (int number) {
        if (number%2==0) {
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(checkMyNumber(5));
        System.out.println(checkMyNumber(8));
    }
}