package com.codecool.zsofi;

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
}
