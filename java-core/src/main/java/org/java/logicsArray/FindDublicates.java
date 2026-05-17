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
public class FindDublicates {
    public static void main(String []args)
    {
        boolean bool = false;
        int arr[] = {2, 10,10, 100, 2, 10, 11,2,11,2};
        ArrayList<Integer> list = new ArrayList<>();
        for(int  i = 0; i< arr.length; i++)
        {
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    if(list.contains(arr[i]))
                    {
                        break;
                    }
                    else{
                        list.add(arr[i]);
                        bool = true;
                    }
                }
            }
        }
        if(bool == true)
        {
            System.out.println(list + " ");
        }
        else
        {
            System.out.println("\n No dublicates \n ");
        }
        
        
    }
    
}
