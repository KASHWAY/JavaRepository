package pl.targosz.homework;


import org.junit.jupiter.api.Assertions;

public class NumberCheckTest {


    void shouldReturnFirstThing() {
        //given
        int number = 5;
        //when
        boolean MyNumber = NumberCheck.checkMyNumber(number);
        //then
        Assertions.assertEquals(false,number);
    }void shouldReturnSecondThing() {
        //given
        int number = 8;
        //when
        boolean MyNumber = NumberCheck.checkMyNumber(number);
        //then
        Assertions.assertEquals(true,number);
    }

}