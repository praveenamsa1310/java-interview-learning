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
public class Factorial {
    public static void main(String[] args) {
        int fact = 1,num;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter end value : ");
        num = obj.nextInt();
        for(int i = 1; i<=num; i++)
        {
            fact = fact * i;
        }
        System.out.println(fact);
        int result = fact1(num);
        System.out.println("Using recursive function: "+result);
    }
    static int fact1(int a)
    {
        
        //int sum = 1;
        if(a==0)
             return 1;
        else
           return a * fact1(a-1);
    }
}
