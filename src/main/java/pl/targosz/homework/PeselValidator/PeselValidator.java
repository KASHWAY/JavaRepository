package pl.targosz.homework.PeselValidator;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator {

    private static boolean isPeselSizeValid(String text) {

        Pattern pattern = Pattern.compile("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d");
        for (int i = 0; i < 11; i++) {
            Matcher matcher = pattern.matcher(text);
            boolean matches = matcher.matches();
            return matches;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPeselSizeValid("12345632110"));
        System.out.println(isPeselSizeValid("ABCDEFGH"));
    }
}





