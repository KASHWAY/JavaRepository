package pl.targosz.homework.TextFormatter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ToSmallLettersTest {
    @Test
    void shouldReturnSmallCase() {
        ToSmallLetters toSmallLetters = new ToSmallLetters();
        String text = toSmallLetters.formatText("SPOKUJ");
        Assertions.assertEquals("spokuj", text);
    }

}