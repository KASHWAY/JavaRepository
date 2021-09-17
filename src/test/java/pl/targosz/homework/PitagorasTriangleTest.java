package pl.targosz.homework;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class PitagorasTriangleTest {
    void shouldReturnTrue() {
        boolean triangle;
        triangle = PitagorasTriangle.Triangle(3,4,5);
        Assertions.assertEquals(true,triangle);
    }

}