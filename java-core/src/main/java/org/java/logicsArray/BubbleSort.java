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
public class BubbleSort {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int  i = 0 ; i<n; i++)
        {
            arr[i] = in.nextInt();
        }
        for(int x: arr)
        { System.out.print(x+ " ");}
        System.out.print("\n After sorting\n ");
        int temp = arr[0];
           for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<(n-i-1); j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int x: arr)
        { System.out.print(x+ " ");}
        
    }
    
}
