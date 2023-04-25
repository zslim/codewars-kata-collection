package com.codecool.zsofi;

import java.util.HashMap;
import java.util.Map;

public class ArrayInspector {  // TODO: get rid of static things
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
        double repeatedNumber;
        if (numbers[0] == numbers[1] || numbers[0] == numbers[2]) {
            repeatedNumber = numbers[0];
        } else {
            repeatedNumber = numbers[1];
        }
        Double result = null;
        int index = 0;
        while (result == null) {
            if (numbers[index] != repeatedNumber) {
                return numbers[index];
            }
            index++;
        }
        throw new IllegalStateException();
    }
}
