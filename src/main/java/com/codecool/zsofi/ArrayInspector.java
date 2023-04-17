package com.codecool.zsofi;

import java.util.HashMap;
import java.util.Map;

public class ArrayInspector {
    public static int findBiggestDifference(int[] numbers) {
        int minimum = numbers[0];
        int maximum = numbers[0];
        for (int number : numbers) {
            if (number < minimum) {
                minimum = number;
            }
            if (number > maximum) {
                maximum = number;
            }
        }
        int difference = maximum - minimum;
        return difference;
    }

    public static double findDifferentNumber(double[] numbers) {
        Map<Double, Integer> counter = new HashMap<>();
        for (double number : numbers) {
            if (!counter.containsKey(number)) {
                counter.put(number, 1);
            } else {
                counter.put(number, counter.get(number) + 1);
            }
            if (anyRepetitions(counter)) {
                break;
            }
        }
        double result = numbers[0];
        for (Map.Entry<Double, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
            }
        }
        return result;
    }

    private static boolean anyRepetitions(Map<Double, Integer> counter) {
        boolean twoEntries = counter.entrySet().size() > 1;
        boolean repetitionFound = false;
        for (Map.Entry<Double, Integer> entry: counter.entrySet()) {
            if (entry.getValue() > 1) {
                repetitionFound = true;
            }
        }
        return twoEntries && repetitionFound;
    }
}
