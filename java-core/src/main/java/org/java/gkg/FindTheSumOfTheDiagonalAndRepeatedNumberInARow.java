/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java.gkg;
import java.util.*;
/**
 *
 * @author PRAVEENAGRUD75
 */
public class FindTheSumOfTheDiagonalAndRepeatedNumberInARow {
    // Function to calculate trace of
    // a matrix and number of rows and
    // columns with repeated elements
    public static String vestigium(int N, int M[][])
    {
        // Stores the trace, number of
        // rows and columns consisting
        // of repeated matrix elements
        int trace = 0, row_repeat = 0;
        int column_repeat = 0;
        // Iterate over the matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // If current element is
                // present in the main diagonal
                if (i == j) {
                    // Update trace
                    trace += M[i][j];
                }
            }
            int flag1 = 0;
            // Iterate over each row
            // and increment row_repeat
            // if repeated values exists
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    // For each valid range
                    if (j != k && M[i][j] == M[i][k]) {
                        row_repeat++;
                        flag1 = 1;
                        break;
                    }
                }
                if (flag1 == 1) {
                    break;
                }
            }
            int flag2 = 0;
            // Iterate over each column and
            // increment column_repeat if
            // repeated values are encountered
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    // For each valid range
                    if (j != k
                        && M[j][i] == M[k][i]) {
 
                        column_repeat++;
                        flag2 = 1;
                        break;
                    }
                }
                if (flag2 == 1) {
                    break;
                }
            }
        }
        // Answer
        String output = trace + " "+ row_repeat + " "+ column_repeat + "\n";
        // Return answer
        return output;
    }
    // Driver Code
    public static void main(String[] args)
    {
        int M[][] = { { 1, 2, 2, 4 },
                      { 2, 1, 4, 3 },
                      { 3, 4, 1, 2 },
                      { 4, 3, 5, 1 } };
        int N = M.length;
        String output = vestigium(N, M);
        // Print the output
        System.out.print(output);
    }
}