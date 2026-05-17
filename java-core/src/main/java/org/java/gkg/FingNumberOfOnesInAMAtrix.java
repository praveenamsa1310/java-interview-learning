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
public class FingNumberOfOnesInAMAtrix {
	public static void main (String[] args)
	 {
	    Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    while(t-- > 0)
	    {
	        int n = in.nextInt();
	        int m = in.nextInt();
	        int a[][] = new int[n][m];
	        for(int i = 0; i<n; i++)
	        {
	            for(int j = 0; j<m; j++)
	            {
	                a[i][j] = in.nextInt();
	            }
	        }
	        int q = in.nextInt();
	        int r1,r2,c1,c2;
	        for(int x = 0; x<q; x++)
	        {
	            r1 = in.nextInt();
	            c1 = in.nextInt();
	            r2 = in.nextInt();
	            c2 = in.nextInt();
	            findOnes(a,r1,c1,r2,c2);
	        }
	    }
	 }
	 public static void findOnes(int a[][], int r1,int c1, int r2, int c2)
	 {
	     int sum =0;
	     for(int  i = r1-1; i<r2; i++)
	     {
	         for(int j = c1-1; j<c2; j++)
	         {
	             if(a[i][j] == 1)
	             {
	                 sum = sum + 1;
	             }
	         }
	     }
	     System.out.println(sum);
	 }
}





