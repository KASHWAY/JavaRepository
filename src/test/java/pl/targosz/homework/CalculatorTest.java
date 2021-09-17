package pl.targosz.homework;


import org.junit.jupiter.api.Assertions;


public class CalculatorTest {

    void shouldAddTwoNumbers() {

        //given
        double value1 = 7;
        double value2 = 5;
        //when
        double sum = Calculator.add(value1, value2);
        //then
        Assertions.assertEquals(12, sum);
    }

    void shouldMinusTwoNumbers() {

        //given
        double value1 = 10.5;
        double value2 = 5;
        //when
        double minus = Calculator.add(value1, value2);
        //then
        Assertions.assertEquals(5.5, minus);
    }

    void shouldSMultiTwoNumbers() {

        //given
        double value1 = 15;
        double value2 = 20;
        //when
        double multiplication = Calculator.add(value1, value2);
        //THEN
        Assertions.assertEquals(300, multiplication);
    }

    void shouldAddSplitNumbers() {

        //given
        double value1 = 10;
        double value2 = 10;
        //when
        double split = Calculator.add(value1, value2);
        //then
        Assertions.assertEquals(15.33, split);
    }

}