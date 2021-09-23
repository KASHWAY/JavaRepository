package pl.targosz.homework.TextFormatter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ToBigLettersTest {
    @Test
    void shouldReturnBigCase() {
        ToBigLetters toBigLetters = new ToBigLetters();
        String text = toBigLetters.formatText("sigib");
        Assertions.assertEquals("SIGIB", text);
    }

}