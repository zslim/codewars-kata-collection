package com.codecool.zsofi;

import java.util.Deque;
import java.util.LinkedList;

public class Calculator {
    public static String sumStringNumbers(String numberA, String numberB) {
        Deque<String> digitsA = stringToDeque(numberA);
        Deque<String> digitsB = stringToDeque(numberB);
        Deque<String> sum = sumStringNumbers(digitsA, digitsB);
        String result = dequeToString(sum);
        return result;
    }

    private static Deque<String> sumStringNumbers(Deque<String> digitsA, Deque<String> digitsB) {
        int numeralSystemBase = 10;
        int overflow = 0;
        int resultDigit;
        Deque<String> result = new LinkedList<>();
        while (!digitsA.isEmpty() || !digitsB.isEmpty()) {
            int digitA = getDigit(digitsA);
            int digitB = getDigit(digitsB);
            int sum = digitA + digitB + overflow;
            if (sum >= numeralSystemBase) {
                resultDigit = sum % numeralSystemBase;
                overflow = sum / numeralSystemBase;
            } else {
                resultDigit = sum;
                overflow = 0;
            }
            result.push(String.valueOf(resultDigit));
        }
        if (overflow > 0) {
            result.push(String.valueOf(overflow));
        }
        return result;
    }

    private static Deque<String> stringToDeque(String numberAsString) {
        String[] digits = numberAsString.split("");
        Deque<String> digitStack = new LinkedList<>();
        for (String digit : digits) {
            digitStack.push(digit);
        }
        return digitStack;
    }

    private static int getDigit(Deque<String> deque) {
        int digit;
        if (deque.isEmpty()) {
            digit = 0;
        } else {
            String element = deque.pop();
            if (element.isEmpty()) {
                digit = 0;
            } else {
                digit = Integer.parseInt(element);
            }
        }
        return digit;
    }

    private static String dequeToString(Deque<String> deque) {
        StringBuilder result = new StringBuilder();
        boolean anyNonZeroYet = false;
        while (!deque.isEmpty()) {
            String element = deque.pop();
            if (!anyNonZeroYet) {
                if (element.equals("0")) {
                    continue;
                } else {
                    anyNonZeroYet = true;
                }
            }
            result.append(element);
        }
        return result.toString();
    }
}
