package pl.targosz.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class ReturningTextLengthTest {



    @ParameterizedTest
    @MethodSource("numberSomething")
    void shouldReturn5(String input) {

        assertEquals(5, (input));
    }
    private static int lengthOfTheText(String text) {
        return text.length();
    }

}