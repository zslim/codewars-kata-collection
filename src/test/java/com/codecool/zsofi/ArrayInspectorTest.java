package com.codecool.zsofi;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayInspectorTest {

    private static Stream<Arguments> provideParametersForFindBiggestDifference() {
        return Stream.of(
                Arguments.of(6, new int[]{1, 5, 7}),
                Arguments.of(0, new int[]{1, 1}),
                Arguments.of(99, new int[]{-1, -100}),
                Arguments.of(107, new int[]{100, -7}),
                Arguments.of(999999999, new int[]{0, 999999999}),
                Arguments.of(8983, new int[]{1, -95, 33, 8888, 94, -4})
        );
    }

    @ParameterizedTest
    @MethodSource("provideParametersForFindBiggestDifference")
    void findBiggestDifference(int expected, int[] input) {
        int actual = ArrayInspector.findBiggestDifference(input);
        assertEquals(expected, actual);
    }
}
