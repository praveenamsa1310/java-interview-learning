/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java.Database;

import java.util.*;

/**
 *
 * @author PRAVEENAGRUD75
 */
public class level3Test {
    public static void main(String []args)
    {
        Scanner obj  = new Scanner(System.in);
        int row = obj.nextInt();
        int col = obj.nextInt();
        int[][] arr = new int[row][col];
        for(int i =0; i<row; i++)
        {
            for(int j =0 ; j<col; j++)
            {
                arr[i][j] = obj.nextInt();
            }
        }
    }
}
