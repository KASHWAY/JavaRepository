package pl.targosz.homework.URLValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLValidator {
    private static boolean isUrlValidate(String URL) {
        Pattern pattern = Pattern.compile("https?://w?w?w?\\.?\\w+\\.\\w+?\\.?\\w?\\.?\\w?\\w?\\w+");
        Matcher matcher = pattern.matcher(URL);

        boolean matches = matcher.matches();
        return matches;
    }

    public static void main(String[] args) {
        System.out.println(isUrlValidate("http://www.onet.pl"));
        System.out.println(isUrlValidate("https://mail.google.com"));
        System.out.println(isUrlValidate("http://wiadmosci.onet.pl"));
        System.out.println(isUrlValidate("http://onet.pl"));
    }
}
