package org.java.Database;
import java.util.*;
public class BeautifulHouse 
{ 
    public static void main(String[] args) 
    { 
        int diagonal = 0;
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int arr[][] = new int[row][col];
        for(int i = 0; i<row; i++)
        {
           for(int j = 0; j<col; j++)
           {
               arr[i][j] = in.nextInt(); 
           } 
        } 
        int total = 0; 
        if(arr[0][0] == 1 && arr[1][1] == 1)
        {
            diagonal = diagonal + 1;
        }
        for(int i=0; i<arr.length; i++)
        { 
            for(int j=0; j<arr[i].length; j++)
            { 
                if(arr[i][j] == 1)
                {            
                    findIslands(arr,i,j); 
                    total ++;                     
                } 
            } 
        } 
        System.out.println("Total number of islands is " + (total-diagonal)); 
    } 
    static void findIslands(int[][] arr, int x, int y) { 
        try 
        { 
            if (arr[x][y] == 1)      
            { 
                arr[x][y] = 0; 
                findIslands(arr, x + 1, y); 
                findIslands(arr, x, y + 1); 
                findIslands(arr, x - 1, y); 
                findIslands(arr, x, y - 1); 
                findIslands(arr, x + 1, y + 1); 
                findIslands(arr, x - 1, y - 1); 
                findIslands(arr, x + 1, y - 1); 
                findIslands(arr, x - 1, y + 1); 
            } 
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        { } 
    } 
} 