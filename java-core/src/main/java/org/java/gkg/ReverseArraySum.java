/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java.gkg;
 import java.util.*;
/**
 *
 * @author PRAVEENAGRUD75
 */
public class ReverseArraySum {
	public static void main (String[] args)
	 {
	    Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	   
	    while(t-- > 0)
	    {
                 int sum = 0;
	        int n = in.nextInt();
	        int a[] = new int[n];
	        for(int i = 0; i<n; i++)
	        {
	            a[i] = in.nextInt();
	        }
	        int j = n-1;
	        while(true)
	        {
                    if(j == -1)
                        break;
	            sum += (a[j] * a[j]);
                    j--;
                    if(j == -1)
                        break;
                    sum -=(a[j]*a[j]);
                    j--;                 
	        }
	        System.out.println(sum);
	    }
         }
}
