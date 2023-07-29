package com.havefunwith.test;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class CalculatorTest {

    @Test
    void canAddTwoNumbers() {
        Calculator underTest = new Calculator();
        var number1 = 10;
        var number2 = 20;
        var result = underTest.add(number1, number2);
        Assert.assertEquals(30, result);
    }
}
