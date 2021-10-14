package pl.targosz.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class IsNumberSplit2AndCountingDigitTest {

    @ParameterizedTest
    @ValueSource(ints = {440})
    void isSplitThrough2_ShouldReturnTrueForNumber(int number) {
        assertTrue(IsNumberSplit2AndCountingDigit.isSplitThrough2(number));
    }
    @ParameterizedTest
    @CsvSource({"440"})
    void isCountingDigit_ShouldReturnTrueForNumber(int number){
        assertEquals(8,IsNumberSplit2AndCountingDigit.countingDigit(number));
    }


}