package pl.targosz.homework;


public class FileSquareRoot {

    public static double squareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        return Math.sqrt(number);
    }


    public static void main(String[] args) {
        System.out.println(squareRoot(25));
        System.out.println(squareRoot(-5));
    }

}
