package pl.targosz.homework;

public class TextOperator {
    public static boolean isPalindrome(String text) {
        int length = text.length();
        int forward = 0, backward = length - 1;
        while (backward > forward) {
            char forwardChar = text.charAt(forward++);
            char backwardChar = text.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;


        }
        return true;
    }

    public static void main(String[] args) {
        String text = "To mój tekst";
        String[] someArray = text.split("");
        for (int i = 0; i < someArray.length; i++) {
            if (someArray[i].contains("")) {
                System.out.println("There is a char!");
                System.out.println("Text length : " + text.length());
                break;
            }
            else
                    System.out.println("There is no characters!");
        }
        System.out.println(isPalindrome(text));

    }
}
