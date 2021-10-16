package pl.targosz.homework;

public class TextOperator {
    public static boolean isPalindrome(String text) {
        int length = text.length();
        int forward = 0, backward = length - 1;
        while (backward > forward) {
            char forwardChar = text.charAt(forward++);
            char backwardChar = text.charAt(backward--);
            if (forwardChar != backwardChar) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String text = "Sigib";

        method(text);

    }

    private static void method(String text) {
        if (!(text == null || text.equals(""))) {
            System.out.println(isPalindrome(text));
            System.out.println(text.length());
        }
    }
}
