package org.java.dataStructure;

public class RemoveDuplicateNumbers {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        int[] dRarr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1 ; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                }
            }
        }
    }
}
