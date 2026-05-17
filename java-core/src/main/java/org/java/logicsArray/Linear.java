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
public class Linear {
    public static int flag;
    public static void main(String[] args)
    {
        
        int[] a = {2,3,4,5,6};
        int item = 5;
        for(int i = 0; i<a.length;i++)
        {
            if(item == a[i])
            {
                flag =1;
            }
            else
            {
                flag = 0;
            }
            if(flag == 1)
            System.out.println("Item found");
        }
        
    }
    
}
