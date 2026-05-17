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
public class FibonacciSeries {
    static int f1 = 0,f2 = 1,num,fib;
    public static void main(String[] args) {
        int f1 = 0,f2 = 1,num,fib;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter end value : ");
        num = obj.nextInt();
        System.out.print(f1+","+f2+",");
        for(int i = 0; i<=num;i++)
        {
            fib = f1 + f2;
            f1 = f2;
            f2 = fib;
            System.out.print(fib+",");
        }
        System.out.println();
        System.out.print("Using : "+f1+" "+f2);
        fib(num);
        
    }
    static void fib(int num)
    {
        if(num>0)
        {
          fib = f1 + f2;
          f1 = f2;
          f2 = fib;
          System.out.println(" "+fib);
          fib(num-1);
        }
          
    }
}
