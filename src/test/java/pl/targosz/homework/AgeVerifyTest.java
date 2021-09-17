package pl.targosz.homework;

import org.junit.jupiter.api.Assertions;


public class AgeVerifyTest {
    void shouldAnswerFalseIfNumberIsLessThan18() {

        //given
        int number = 15;
        //when
        boolean verify = AgeVerify.verifyMyAge(number);
        //then
        Assertions.assertEquals(false, number);

    }

    void shouldAnswerTrueIfNumberIsAtLeast18() {

        //given
        int number = 19;
        //when
        boolean verify = AgeVerify.verifyMyAge(number);
        //then
        Assertions.assertEquals(true, number);

    }
}