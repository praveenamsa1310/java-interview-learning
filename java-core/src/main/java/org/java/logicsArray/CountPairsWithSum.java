/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java.logicsArray;

/**
 *
 * @author PRAVEENAGRUD75
 */
public class CountPairsWithSum {
    public static void main(String []args)
    {
        int arr[] = {1,1,1,1};
        int sum = 2;
        int count = 0;
        for(int  i = 0; i< arr.length; i++)
        {
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[i] + arr[j] == sum)
                   count +=1;
            }
        }
        System.out.println(count);
    }
}
