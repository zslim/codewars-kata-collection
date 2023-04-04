package com.codecool.zsofi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "123, 456, 579",  // equal lengths
            "123, 459, 582",  // equal lengths with inner overflow
            "723, 456, 1179",  // equal lengths with outer overflow
            "1230, 456, 1686",  // unequal lengths
            "1234, 7, 1241",  // unequal lengths with overflow
            "1, '', 0",  // empty string
            "034, 0003, 37"  // leading zeros
    })
    void testSumStringNumbers(String firstNumber, String secondNumber, String expected) {
        String actual = Calculator.sumStringNumbers(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }
}