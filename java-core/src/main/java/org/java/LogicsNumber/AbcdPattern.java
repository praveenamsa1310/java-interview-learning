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
public class AbcdPattern {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a = obj.nextInt();
        printAbcd(a);
        printAaa(a);
        printNumber(a);
    }
    static void printAaa(int a)
    {
        for(int i = 1; i<=a; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }
    static void printAbcd(int a)
    {
        for(int i = 1; i<=a; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
    static void printNumber(int a)
    {
        for(int i = 1; i<=a; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
