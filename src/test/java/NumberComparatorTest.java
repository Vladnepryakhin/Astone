package test.java;

import org.example.NumberComparator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberComparatorTest {
    @Test
    void testFirstGreater() {
        assertEquals("5 больше чем 3", NumberComparator.compare(5, 3));
    }

    @Test
    void testSecondGreater() {
        assertEquals("3 меньше чем 5", NumberComparator.compare(3, 5));
    }

    @Test
    void testEqualNumbers() {
        assertEquals("Числа равны", NumberComparator.compare(5, 5));
    }
}