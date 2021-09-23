package pl.targosz.homework.InterfaceToCountParimeterAndArea;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    public void SquareAreaTest() {
        Square square = new Square(15);
        double result = square.Area();
        Assertions.assertEquals(225,result);

    }
    public void SquareParimeterTest() {
        Square square = new Square(15);
        double result = square.Parimeter();
        Assertions.assertEquals(60,result);
    }
}