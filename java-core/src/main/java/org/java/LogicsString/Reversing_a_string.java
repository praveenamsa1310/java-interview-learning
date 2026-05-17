/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java.LogicsString;
import java.util.Scanner;
//import java.lang.*;
//import java.io.*;
/**
 *
 * @author PRAVEENAGRUD75
 */
public class Reversing_a_string {
    public static void main(String[] args)
    {
        System.out.println("Reversing a String using StringBuilder Class\n");
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter a String : ");
        String getValue = obj.nextLine();
        StringBuilder input1 = new StringBuilder();
        input1.append(getValue);
        String temp = input1.reverse().toString();
        if(getValue.equals(temp))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
//        System.out.println("Reversing a String using toCharArray method\n");
//        char[] try91 = getValue.toCharArray();
//        for(int i = try1.length-1; i>=0; i-- )
//            System.out.print(try1[i]);
    }
}
