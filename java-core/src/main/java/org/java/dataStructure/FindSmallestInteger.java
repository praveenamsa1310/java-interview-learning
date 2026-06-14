package org.java.dataStructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindSmallestInteger {

    public static void main(String[] args) {

        int[] input1 = new int[]{1, 3, 6, 4, 1, 2};
        int[] input2 = new int[]{1, 2, 3};
        int[] input3 = new int[]{-1, -3};
        System.out.println(getSmallestInteger(input1));
        System.out.println(getSmallestInteger(input2));
        System.out.println(getSmallestInteger(input3));

        // Second approach

        int[] input4 = new int[]{1, 3, 6, 4, 1, 2};
        int[] input5 = new int[]{1, 2, 3};
        int[] input6 = new int[]{-1, -3};
        System.out.println(getSmallestIntegerAnotherApproach(input4));
        System.out.println(getSmallestIntegerAnotherApproach(input5));
        System.out.println(getSmallestIntegerAnotherApproach(input6));
    }

    public static int getSmallestIntegerAnotherApproach(int[] input) {
        Set<Integer> input1 = new HashSet<>();
        for (int n: input) {
            if (n > 0)
                input1.add(n);
        }
        int smallestInteger = 1;
        while (input1.contains(smallestInteger)) {
            smallestInteger++;
        }
        return smallestInteger;
    }
    // Find Smallest Integer
    public static int getSmallestInteger(int[] input) {
        Arrays.sort(input);
        int smallestInteger = 1;
        for (int num: input) {
            if (num == smallestInteger) {
                smallestInteger++;
            }
        }
        return smallestInteger;
    }
}
