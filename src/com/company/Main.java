package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
    }

    public static int[] twoNumberSumFirstSolution(int[] array, int targetSum) {

        for (int i = 0; i == array.length - 1; i++) {
            int firstNum = array[i];
            for (int j = i; j < array.length; j++) {
                int secondNum = array[j];
                if (firstNum + secondNum == targetSum) {
                    System.out.println(firstNum + secondNum);
                }
            }
        }
        return new int[0];
    }

    public static int[] twoNumberSumSecondSolution(int[] array, int targetSum) {
        Map<Integer, Boolean> hashmap = new HashMap<>();

        for (int num : array) {
            int potentialMatch = targetSum - num;
            if (hashmap.containsKey(potentialMatch)) {
                return new int[]{potentialMatch, num};
            } else {
                hashmap.put(num, true);
            }
        }
        return new int[0];
    }

    public static int[] twoNumberSumThirdSolution(int[] array, int targetSum) {
        Arrays.sort(array);

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int currentSum = array[left] + array[right];
            if (currentSum == targetSum) {
                return new int[]{array[left], array[right]};
            } else if (currentSum < targetSum) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
}
