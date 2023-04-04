package com.codecool.zsofi;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Calculator {

    public static String sumStringNumbers(String numberA, String numberB) {
        // convert numbers to Stacks
        Deque<String> digitsA = stringToStack(numberA);
        Deque<String> digitsB = stringToStack(numberB);

        // get one from each stack
        // sum & store remainder
        // turn result stack into String
        throw new UnsupportedOperationException();
    }

    public static Deque<String> stringToStack(String numberAsString) {
        String[] digits = numberAsString.split("");
        return new LinkedList<>(Arrays.asList(digits));
    }
}
