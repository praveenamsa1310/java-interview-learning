/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java.logicsArray;
import java.util.Scanner;
/**
 *
 * @author PRAVEENAGRUD75
 */
public class Maximum {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int temp;
        int arr[] = new int[10];
        for(int i = 0; i<5; i++)
        {
            System.out.print("Enter "+ i +" Element : ");
            temp = obj.nextInt();
            arr[i] = temp;
        }
        int max = arr[0];
        for(int i = 0; i<5; i++)
        {
            if( arr[i]> max)
            {
                max = arr[i];
            }
        }
         System.out.print("Largest element : "+max);
         for(int i = 0; i<5; i++)
        {
            if( arr[i]< max)
            {
                max = arr[i];
            }
        }
         System.out.print("Sallest element : "+max);
    }
    
}
