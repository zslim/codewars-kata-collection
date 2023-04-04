package com.codecool.zsofi;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "579, 123, 456",  // equal lengths
            "582, 123, 459",  // equal lengths with inner overflow
            "1179, 723, 456",  // equal lengths with outer overflow
            "1686, 1230, 456",  // unequal lengths
            "1241, 1234, 7",  // unequal lengths with overflow
            "1, 1, ''",  // empty string
            "37, 034, 0003"  // leading zeros
    })
    void testSumStringNumbers(String expected, String firstNumber, String secondNumber) {
        String actual = Calculator.sumStringNumbers(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }
}
