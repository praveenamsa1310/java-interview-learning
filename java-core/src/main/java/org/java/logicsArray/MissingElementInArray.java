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
public class MissingElementInArray {
    public static void main(String []args)
    {
    int arr[] = {1,2,3,4,5,6,7,9};
    int n = arr.length;
    int sum = 0;
    int total = (n + 1 )*(n+2)/2;
    for(int i =0; i<n; i++)
    {
        sum += arr[i];
    };
    System.out.println(total-sum);
    }   
}
