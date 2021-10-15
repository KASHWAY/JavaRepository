package pl.targosz.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReturningTextLengthTest {


    @ParameterizedTest
    @MethodSource("inputArguments")
    void shouldReturn5(String input) {

        assertEquals(5, input.length());
    }

    private static Stream <Arguments> inputArguments() {
        return Stream.of(
            Arguments.of("SIGIB")
        );
    }

}