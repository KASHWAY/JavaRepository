package pl.targosz.homework;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class ConvertMinutesToSecondsTest {
    void shouldReturn3000() {

        int number = ConvertMinutesToSeconds.ConvertMinutes(50);
        Assertions.assertEquals(3000, number);
    }

}