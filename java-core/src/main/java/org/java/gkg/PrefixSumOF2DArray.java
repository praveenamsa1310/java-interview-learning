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
public class PrefixSumOF2DArray 
{
    public static void prefixSum2D(int a[][])
    {
        int r = a.length;
        int c = a[0].length;
        int psa[][] = new int[r][c];
        psa[0][0] = a[0][0];
        //TODO: filling first row
        for(int i = 1; i<c; i++)
        {
            psa[0][i] = psa[0][i-1] + a[0][i];
        }
        //Filling first colum
        for(int i = 1; i<r; i++)
        {
            psa[i][0] = psa[i-1][0] + a[i][0];
        }
        for(int i = 1; i<r; i++)
        {
            for(int j = 1; j<c; j++)
            {
                psa[i][j] = psa[i-1][j] + psa[i][j-1] - psa[i-1][j-1] + a[i][j];
            }
        }
        for(int i = 0; i<r; i++)
        {
            for(int j = 0; j<c; j++)
            {
                System.out.print(psa[i][j]+ " ");
            }
            System.out.println();
        }
    }
    // driver code
    public static void main(String[] args)
    {
        int a[][] = { { 1, 1, 1, 1, 1 },
                      { 1, 1, 1, 1, 1 },
                      { 1, 1, 1, 1, 1 },
                      { 1, 1, 1, 1, 1 } };
        prefixSum2D(a);
    }
}
