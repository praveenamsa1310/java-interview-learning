package org.java.interviewCodingQuestions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author PC
 * @version 1.0
 * @created 25-07-2024 08:02 am
 * @project Java-Learning
 * @copyright Copyright (c) Praveen. All rights reserved.
 * @descrpition Class level description
 */

public class BasicSyntax {

    public static void main(String[] args) {
        System.out.println("Main class");
        System.out.println(3 + "1");

        int x1, x2, x3;
        x1 = x2 = x3 = 10;

        String string = "string value";
        final int intvalue = 2;
        float floatValue = 3.55f;

        String txt = " ABCDEFGHIJKL MNOPQRSTUVWXYZ ";

        System.out.println("Length: "+ txt.length());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.toLowerCase().indexOf("u"));

        String[] myStringArray = txt.split(" ");
        for (String s : myStringArray) {
            System.out.println(s);
        }

        System.out.println(txt+"Praveen K\"");


        String myTxt = "ABCDEFGHIJK";

        String reversedStr = "";

        char[] myCharArr = myTxt.toCharArray();

        for (int i = myCharArr.length - 1; i >= 0; i --) {
            System.out.print(myCharArr[i]);
        }

        for(int i = 0; i< myTxt.length(); i++) {
            reversedStr = myTxt.charAt(i) + reversedStr;
        }
        System.out.println();
        System.out.println(reversedStr);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(myCharArr);
        System.out.println(stringBuilder.reverse());

        // Java Arrays
        System.out.println("Arrays ----------------------------------");
        String[]  cars = {"A", "B"};
        for (String a: cars) {
            System.out.println(a + ((!a.isEmpty()) ? "," : ""));
        }

        int[] myNum = {4,4,2,6,2,6,7,3};

        int[][] myNumbers1 = {
                {1,2,3,4},
                {1,2,3,4}
        };
        int[][] myNumbers2 = {
                {1,2,3,4},
                {1,2,3,4}
        };
        int[][] myNumbersNew = new int[2][2];
        for (int i = 0; i < myNumbers1.length; i++) {
            for (int j = 0; j < myNumbers2.length; j++) {
                myNumbersNew[i][j] = myNumbers1[i][j] + myNumbers2[i][j];
            }
        }
        for (int i = 0; i < myNumbersNew.length; i++) {
            for (int j = 0; j < myNumbersNew[i].length; j++) {
                System.out.println(myNumbersNew[i][j]);
            }
        }

// ********************* "Prime numbers between **********************
        int start = 11;
        int end = 20;

        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (i > 1) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime)
                    System.out.println(i);
            }
        }

// ********************* dateFormat24Hrs **********************

        String dateFormat24Hrs = "Feb 28 2023 23:59";
        // Input date formater 24 hrs
        SimpleDateFormat inputFormat = new SimpleDateFormat("MMM dd yyyy HH:mm");
        // Output date time formater 12hrs
        SimpleDateFormat outputFormat = new SimpleDateFormat("MMM dd yyyy hh:mm a");

        try {
            Date date = inputFormat.parse(dateFormat24Hrs);
            System.out.println("Date time 24hr format : " + dateFormat24Hrs);
            System.out.println("Date time 12 hrs format: " + outputFormat.format(date));

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.MINUTE, 2);

            System.out.println("Date time after adding 2 minutes : " + outputFormat.format(calendar.getTime()));

        } catch (ParseException e) {
            e.printStackTrace();
        }

// ********************* reorder array **********************

        Integer[] array = {1,1,0,1};

        int index = 0; // Pointer for the position of the next zero

        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                // Swap if we find a 0
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
                index++;
            }
        }
        System.out.println("Output: " + Arrays.toString(array));

// ********************* palindrome **********************

        String palTxt = "racecar";
        int left = 0;
        int right = palTxt.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (palTxt.charAt(left) != palTxt.charAt(right)) {
                isPalindrome = false;
                break;
            }
            else {
                left++;
                right--;
            }
        }
        if (isPalindrome)
            System.out.println("Given text is Palindrome: " + palTxt);
        else
            System.out.println("Not a palindrome..!");

/********************* Reverse A String  *****************************************/
        String inputString = "ja2va pro3gram";
//        String outputString = "aj2av orp3marg";

        StringBuilder result = new StringBuilder();
        StringBuilder segment = new StringBuilder();

        for (char ch : inputString.toCharArray()) {
            if (Character.isLetter(ch)) {
                segment.append(ch);
            } else {
                result.append(segment.reverse()).append(ch);
                segment.setLength(0);
            }
        }
        result.append(segment.reverse());
        System.out.println(result);


/**********************************************Count Duplicated Characters******************************/
        String input = "tomorrowneverdies";

        // Count occurrences of each character
        Map<Character, Long> characterCounts = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Find the character with the maximum occurrences
        Map.Entry<Character, Long> maxEntry = characterCounts.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow(() -> new RuntimeException("No characters found"));

        // Output results
        System.out.println("Character counts: " + characterCounts);
        System.out.println("Max repeated character: '" + maxEntry.getKey() + "' with count: " + maxEntry.getValue());



/**************** find second highest element from an array***************************/

        int arrayNumbers[] = {21, 1, 3, 2, 4, 5, 6, -1, 21, 9, 9, 10, 11};

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : arrayNumbers) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num < highest) {
                secondHighest = num;
            }
        }
        System.out.println("The second highest element in the array is: " + secondHighest);

/**************** Key Value ***************************/
        // Initialize the input map
        Map<Integer, String> inputMap = new HashMap<>();
        inputMap.put(1, "a");
        inputMap.put(2, "b");
        inputMap.put(3, "c");
        inputMap.put(4, "a");
        inputMap.put(5, "b");

        // Invert the map
        Map<String, Set<Integer>> invertedMap = new HashMap<>();

        for (Map.Entry<Integer, String> entry : inputMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            // Use a Set to avoid duplicate keys
            invertedMap.computeIfAbsent(value, k -> new HashSet<>()).add(key);
        }

        // Print the result
        for (Map.Entry<String, Set<Integer>> entry : invertedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

/************************** Find the continuous sequences of numbers ******************************************/

        String inputva = "1 2 3 5 9 a 8 6 7 8 9 4 @ -5 -7 -3 2 -1";
        findContinuousSequences(inputva);
    }

    public static void findContinuousSequences(String input) {
        String[] elements = input.split("\\s+");
        List<Integer> sequence = new ArrayList<>();

        for (int i = 0; i < elements.length; i++) {
            try {
                int current = Integer.parseInt(elements[i]);

                if (sequence.isEmpty()) {
                    sequence.add(current);
                } else {
                    int previous = sequence.get(sequence.size() - 1);
                    if (current == previous + 1) {
                        sequence.add(current);
                    } else {
                        if (sequence.size() > 1) {
                            printSequence(sequence);
                        }
                        sequence.clear();
                        sequence.add(current);
                    }
                }
            } catch (NumberFormatException e) {
                if (sequence.size() > 1) {
                    printSequence(sequence);
                }
                sequence.clear();
            }
        }

        // Print the last sequence if exists
        if (sequence.size() > 1) {
            printSequence(sequence);
        }
    }

    private static void printSequence(List<Integer> sequence) {
        for (int num : sequence) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
