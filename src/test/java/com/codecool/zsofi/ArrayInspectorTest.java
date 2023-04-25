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

    private static Stream<Arguments> provideParametersForFindDifferentNumber() {
        return Stream.of(
                Arguments.of(0, new double[]{1, 0, 1}),
                Arguments.of(1, new double[]{1, 0, 0}),
                Arguments.of(-1, new double[]{0, 0, -1}),
                Arguments.of(-1, new double[]{0.1, 0.1, -1}),
                Arguments.of(1, new double[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1})
        );  // TODO: generate super long input array
    }

    @ParameterizedTest
    @MethodSource("provideParametersForFindDifferentNumber")
    public void findDifferentNumber(double expected, double[] input) {
        double actual = ArrayInspector.findDifferentNumber(input);
        assertEquals(expected, actual);
    }
}
