package pl.targosz.homework.Lesson7Task2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TextToBigLettersTest {
    @ParameterizedTest
    @ValueSource(strings = {"kochamy mentora mateusza marczaka oraz mateusza patera"})
    void shouldReturnTextInBigLetters(String input) {
        assertEquals(input.toUpperCase(), TextToBigLetters.textToUpperCase(input));
    }

    @ParameterizedTest
    @NullAndEmptySource()
    void shouldReturnTrue(String input) {
        assertTrue(TextToBigLetters.textToUpperCase(input)!=null);
        assertTrue(TextToBigLetters.textToUpperCase(input)!="");
    }
}