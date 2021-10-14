package pl.targosz.homework;

public class IsNumberSplit2AndCountingDigit {
    public static boolean isSplitThrough2(int number) {
        if (number % 2 == 0)
            return true;
        else
            return false;
    }

    public static int countingDigit(int number) {
        int digitCounter = 0;
        while (number != 0) {
            digitCounter += number % 10;
            number = number / 10;
        }
        return digitCounter;
    }

    public static void main(String[] args) {
        System.out.println(isSplitThrough2(440));
        System.out.println(countingDigit(440));
    }

}
