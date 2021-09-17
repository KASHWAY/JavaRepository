package pl.targosz.homework;

import org.junit.jupiter.api.Assertions;

public class WhichWeekDayTest {
    void ShouldReturnWeekend() {
        //given
        int number = 6;
        //when
        String WeekDay = WhichWeekDay.WeekDay(number);
        //then
        Assertions.assertEquals("Weekend",6);
    }
    void ShouldReturnMonday() {
        //given
        int number = 1;
        //when
        String WeekDay = WhichWeekDay.WeekDay(number);
        //then
        Assertions.assertEquals("Monday",1);
    }

}
