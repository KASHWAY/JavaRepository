package pl.targosz.homework.PeselExceptions;

import java.lang.invoke.WrongMethodTypeException;

public class PeselExceptions {
    public static String peselCheck(String pesel, int length) throws IllegalLengthExceptions {
        if (pesel instanceof String) {
            if (length!=11) {
                throw new IllegalLengthExceptions("It is not a Pesel!");
            }
        }
        else
            throw new WrongMethodTypeException("Beep, wrong type of a method.");
        return pesel;
    }

    public static void main(String[] args) throws IllegalLengthExceptions {
        System.out.println(peselCheck("05252606514",11));
        System.out.println(peselCheck("123",11));
        System.out.println(peselCheck("12345678911",10));
    }
}
