package pl.targosz.homework.ExceptionsPesel;

import java.lang.invoke.WrongMethodTypeException;

public class ExceptionsPesel {
    public static String peselCheck(String pesel, int length) throws IllegalLengthException {
        if (pesel instanceof String) {
            if (length!=11) {
                throw new IllegalLengthException("It is not a Pesel!");
            }
        }
        else
            throw new WrongMethodTypeException("Beep, wrong type of a method.");
        return pesel;
    }

    public static void main(String[] args) throws IllegalLengthException {
        System.out.println(peselCheck("05252606514",11));
        System.out.println(peselCheck("123",11));
        System.out.println(peselCheck("12345678911",10));
    }
}
