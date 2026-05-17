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
public class OccurenceOfANumber {
    public static void main(String []args)
    {
        int arr[] = {1,2,3,1,2,4,2,3,5,6,5};
        Arrays.sort(arr);
        int count = 1;
        for(int j: arr)
            System.out.print(j+" ");
        System.out.println();
        //1 1 2 2 2 3 3 
        for(int i =0; i<arr.length - 1; i++)
        {
            if(arr[i] == arr[i+1])
            {
                count++;
            }
            else
            {
                System.out.print(" "+count);
                count = 1;
            }
        }
         System.out.print(" "+count+"\n");
    }
}
