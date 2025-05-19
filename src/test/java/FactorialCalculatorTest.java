package test.java;

import org.example.FactorialCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {
    @Test
    void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.calculateFactorial(0));
    }

    @Test
    void testFactorialOfOne() {
        assertEquals(1, FactorialCalculator.calculateFactorial(1));
    }

    @Test
    void testFactorialOfFive() {
        assertEquals(120, FactorialCalculator.calculateFactorial(5));
    }

    @Test
    void testFactorialOfNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.calculateFactorial(-1);
        });
    }
}