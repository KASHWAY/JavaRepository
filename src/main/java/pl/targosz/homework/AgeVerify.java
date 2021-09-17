package pl.targosz.homework;


public class AgeVerify {
    static boolean verifyMyAge(int number) {
        if (number >= 18) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        System.out.println(verifyMyAge(15));
        System.out.println(verifyMyAge(19));
    }
}
