package org.lab4.testingframeworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void testAdd() {
        assertEquals(11, calculatorService.add(7, 4));
        assertEquals(3, calculatorService.add(2,1 ));
    }

    @Test
    void testSubtract() {
        assertEquals(3, calculatorService.subtract(7, 4));
        assertEquals(1, calculatorService.subtract(2,1));
    }

    @Test
    void testMultiply() {
        assertEquals(28, calculatorService.multiply(7, 4));
        assertEquals(2, calculatorService.multiply(2,1));
    }

    @Test
    void testDivide() {
        assertEquals(1, calculatorService.divide(7, 4));
        assertThrows(ArithmeticException.class, () -> calculatorService.divide(2,0));
    }

}