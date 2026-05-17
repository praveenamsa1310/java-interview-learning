/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java.gkg;

/**
 *
 * @author PRAVEENAGRUD75
 */
import java.util.*;
public class ConvertArrayToReducedForm 
{
// Java Program to convert an Array
// to reduced form
    public static void convert(int arr[], int n)
    {
        // Create a temp array and copy contents
        // of arr[] to temp
        int temp[] = arr.clone();
 
        // Sort temp array
        Arrays.sort(temp);
 
        // Create a hash table.
        HashMap<Integer, Integer> umap = new HashMap<>();
 
        // One by one insert elements of sorted
        // temp[] and assign them values from 0
        // to n-1
        int val = 0;
        for (int i = 0; i < n; i++)
            umap.put(temp[i], val++);
 
        // Convert array by taking positions from
        // umap
        for (int i = 0; i < n; i++)
            arr[i] = umap.get(arr[i]);
    }
 
    public static void printArr(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        int arr[] = {10, 20, 15, 12, 11, 50};
        int n = arr.length;
 
        System.out.println("Given Array is ");
        printArr(arr, n);
 
        convert(arr , n);
 
        System.out.println("\n\nConverted Array is ");
        printArr(arr, n);
 
    }
}
 
