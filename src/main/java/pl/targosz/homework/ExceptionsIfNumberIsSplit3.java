package pl.targosz.homework;

public class ExceptionsIfNumberIsSplit3 {
    public static void validate(int[] values) {
        if (values[0] % 3 != 0)
            throw new IllegalArgumentException();
        else

            System.out.println("Your number can be split through 3!");
    }

    public static void main(String[] args) {
        try {
            validate(new int[]{5});
        } catch (Exception e) {
            System.out.println("Exception caught!");
            e.printStackTrace();
        } finally {
            for (int value : values){
                System.out.println(value);
            }
        }
    }

}
