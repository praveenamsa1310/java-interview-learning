/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java.LogicsNumber;

import java.util.Scanner;

/**
 *
 * @author PRAVEENAGRUD75
 */
public class perfectNumber {
    public static void main(String[] args) {
        int start = 2,end,temp=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter end value : ");
        end = obj.nextInt();
        for(int i = 1; i <end; i++)
        {
            if(end % i == 0)
            {
                temp = temp+i;
            } 
        }
        if(end == temp)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not Perfect Number");
        }
    }
    
}
