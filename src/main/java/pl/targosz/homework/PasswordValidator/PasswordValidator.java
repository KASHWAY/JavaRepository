package pl.targosz.homework.PasswordValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    private static boolean passwordValidator(String password) {
        Pattern pattern1 = Pattern.compile(".{7,}[A-Z]+\\d+[^2021^21]");
        Matcher matcher = pattern1.matcher(password);

        boolean matches = matcher.find();
        return matches;
    }

    public static void main(String[] args) {
        System.out.println(passwordValidator("asdffFfgF1e"));
    }
}
