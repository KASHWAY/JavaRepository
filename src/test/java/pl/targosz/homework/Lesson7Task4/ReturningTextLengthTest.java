package pl.targosz.homework.Lesson7Task4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class ReturningTextLengthTest {

    @ParameterizedTest
    @MethodSource("textLength")
    void shouldReturn5(String input) {
        assertEquals(5, ReturningTextLength.textLength(input));
    }

}