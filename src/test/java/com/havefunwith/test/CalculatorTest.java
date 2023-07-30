package com.havefunwith.test;

import com.havefunwith.modules.demos.test.Calculator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void canAddTwoNumbers() {
        Calculator underTest = new Calculator();
        var number1 = 10;
        var number2 = 20;
        var result = underTest.add(number1, number2);
        assertEquals(30, result);
    }

    @Test
    void canHandleWhenInputIsZero() {
        Calculator underTest = new Calculator();
        var result = underTest.add(0);
        assertEquals(0, result);
    }

    @Test
    void canHandleArrayOfPositiveNumbers() {
        Calculator underTest = new Calculator();
        int[] numArray = new int[]{2, 3, 6};
        var result = underTest.add(numArray);
        assertEquals(11, result);
    }

    @Test
    @Disabled("Disable until bug SEILA#42 is fixed")
    void canHandleArrayOfNegativeNumbers() {
        Calculator underTest = new Calculator();
        int[] numArray = new int[]{-2, -4, -6};
        var result = underTest.add(numArray);
        assertEquals(-12, result);
    }

}
