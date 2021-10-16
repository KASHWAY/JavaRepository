package pl.targosz.homework.PeselValidator;

public class PeselValidator {
    private char PESEL[] = new char[11];

        PESEL[1]=='a';
    public PeselValidator(String peselNumber) {
        if (peselNumber.length() != 11) {
            valid = false;
        }

    }

    static boolean ifPeselIsANumber(String PESEL[]) {
        int ascii = (int) PESEL[1];
        System.out.println(ascii);

    }

    public static void main(String[] args) {
        System.out.println(ifPeselIsANumber());
    }


}





