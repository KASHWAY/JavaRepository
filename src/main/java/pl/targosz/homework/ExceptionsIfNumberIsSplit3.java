package pl.targosz.homework;

public class ExceptionsIfNumberIsSplit3 {
    public static void validate(int value) {
        if (value % 3 != 0)
            throw new IllegalArgumentException();
        else
            System.out.println("Your number can be split through 3!");
    }

    public static void main(String[] args) {
        try {
            validate(5);
        } catch (Exception e) {
            System.out.println("Exception caught!");
            e.printStackTrace();
        } finally {
            validate(3);
        }
    }

}
