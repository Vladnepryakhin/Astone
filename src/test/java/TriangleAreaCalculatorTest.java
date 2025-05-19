package test.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaCalculatorTest {
    private org.example.TriangleArea TriangleArea;

    @Test
    void testAreaWithValidInput() {
        assertEquals(10.0, TriangleArea.calculateArea(5, 4));
    }

    @Test
    void testAreaWithZeroBase() {
        assertThrows(IllegalArgumentException.class, () -> {
            TriangleArea.calculateArea(0, 4);
        });
    }

    @Test
    void testAreaWithNegativeHeight() {
        assertThrows(IllegalArgumentException.class, () -> {
            TriangleArea.calculateArea(5, -4);
        });
    }
}
