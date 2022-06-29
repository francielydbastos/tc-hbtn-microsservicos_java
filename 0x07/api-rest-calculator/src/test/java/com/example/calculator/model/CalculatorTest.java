package com.example.calculator.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    public static void setup() {
        calculator = new Calculator();
    }

    @Test
    void sumTest() {
        Assertions.assertEquals(Double.valueOf(25), calculator.sum(12.0, 13.0));
    }

    @Test
    public void numbersNullSumTest() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            calculator.sum(null, 13.0);
        });
    }

    @Test
    void subTest() {
        Assertions.assertEquals(Double.valueOf(10), calculator.sub(12.0, 2.0));
    }

    @Test
    void divideTest() {
        Assertions.assertEquals(Double.valueOf(2), calculator.divide(12.0, 6.0));
    }

    @Test
    public void divisionByZeroTest() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(12.0, 0.0);
        });
    }

    @Test
    void factorialTest() {
        Assertions.assertEquals(120, calculator.factorial(5));
    }

    @Test
    void integerToBinaryTest() {
        Assertions.assertEquals(10100, calculator.integerToBinary(20));
    }

    @Test
    void integerToHexadecimalTest() {
        Assertions.assertEquals("AA", calculator.integerToHexadecimal(170));
    }

    @Test
    void calculeDayBetweenDateTest() {
        LocalDate day1 = LocalDate.of(2022,4,5);
        LocalDate day2 = LocalDate.of(2022,4,10);

        Assertions.assertEquals(5, calculator.calculeDayBetweenDate(day1, day2));
    }
}
