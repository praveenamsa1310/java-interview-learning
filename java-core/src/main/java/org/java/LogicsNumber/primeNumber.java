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
public class primeNumber {
    public static void main(String[] args) {
        int num = 11;

        for (int i = 1; i <= num; i++) {
            if(i <= 1) continue;

            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
       
        
    }
    
}