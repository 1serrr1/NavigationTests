package com.example.navigationtests;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(5, 4));
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.add(-2, 1));
    }
}
