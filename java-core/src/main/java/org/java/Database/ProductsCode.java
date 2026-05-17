
package org.java.Database;
import java.util.*;

/**
 *
 * @author PRAVEENAGRUD75
 */
public class ProductsCode {
    public static void main(String args[])
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
        System.out.print("Enter k : ");
        int k = obj.nextInt();
        countProducts(arr, k);
    }
    
    public static void countProducts(int arr[][],int k)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<arr.length ;i++)
        {
            for(int j =0 ; j<arr[i].length; j++)
            {
                if(map.containsKey(arr[i][j]))
                {
                    map.put(arr[i][j], map.get(arr[i][j])+ 1);
                }
                else
                {
                    map.put(arr[i][j], 1);
                }
            }
        }
        Set<Integer> t = new TreeSet<>();
        for(Map.Entry<Integer, Integer> mobj:map.entrySet())
        {
          
            if( mobj.getValue() >= k )
                t.add(mobj.getKey());
        }
        Iterator it = t.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        
    }
    
}
