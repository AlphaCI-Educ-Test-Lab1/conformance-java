package edu.alphaci;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void addsTwoNumbers() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Disabled("TODO: implement subtract")
    @Test
    void subtractsTwoNumbers() {
        assertEquals(3, calculator.subtract(10, 7));
    }

    @Disabled("TODO: implement multiply")
    @Test
    void multipliesTwoNumbers() {
        assertEquals(42, calculator.multiply(6, 7));
    }

    @Disabled("TODO: implement divide")
    @Test
    void dividesTwoNumbers() {
        assertEquals(3.0, calculator.divide(9, 3), 0.001);
    }

    @Disabled("TODO: implement divide")
    @Test
    void refusesToDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }
}
