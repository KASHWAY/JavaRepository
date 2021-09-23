package pl.targosz.homework.InterfaceToCountParimeterAndArea;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    public void TriangleAreaTest() {
        Triangle triangle = new Triangle(2,3,4,8);
        double result = triangle.Area();
        Assertions.assertEquals(8,result);
    }

    @Test
    public void TriangleParimeterTest() {
        Triangle triangle = new Triangle(4,5,6,10);
        double result = triangle.Parimeter();
        Assertions.assertEquals(15,result);
    }
}