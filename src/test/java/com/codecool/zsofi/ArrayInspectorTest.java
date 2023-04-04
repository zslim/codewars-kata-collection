package com.codecool.zsofi;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayInspectorTest {

    private static Stream<Arguments> provideParametersForFindBiggestDifference() {
        return Stream.of(
                Arguments.of(new int[]{1, 5, 7}, 6),
                Arguments.of(new int[]{1, 1}, 0),
                Arguments.of(new int[]{-1, -100}, 99),
                Arguments.of(new int[]{100, -7}, 107),
                Arguments.of(new int[]{0, 999999999}, 999999999),
                Arguments.of(new int[]{1, -95, 33, 8888, 94, -4}, 8983)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParametersForFindBiggestDifference")
    void findBiggestDifference(int[] input, int expected) {
        int actual = ArrayInspector.findBiggestDifference(input);
        assertEquals(expected, actual);
    }
}
