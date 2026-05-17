/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java.logicsArray;
import java.util.*;
/**
 *
 * @author PRAVEENAGRUD75
 */
public class RemovedublicatesfromanArray {
    public static void main (String[] args)
    {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n = arr.length;        
        n = removeDuplicates(arr, n);
        
        for (int i=0; i<n; i++)
           System.out.print(arr[i]+" ");
    }
     static int removeDuplicates(int arr[], int n)
    {
        int j = 0;
        if (n==0 || n==1)
            return n; 
        int[] temp = new int[n];
        // Start traversing elements
        for (int i=0; i<n-1; i++)
            // If current element is not equal
            // to next element then store that
            // current element
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];
         //{1, 2, 2, 3, 4, 4, 4, 5, 5};
        // Store the last element as whether
        // it is unique or repeated, it hasn't
        // stored previously
        temp[j++] = arr[n-1];  
        // Modify original array
        for(int i=0; i<j; i++)
            arr[i] = temp[i]; 
        return j;
    }
}
