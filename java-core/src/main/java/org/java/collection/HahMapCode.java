package org.java.collection;
import java.util.*;
public class HahMapCode {
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        int n = in.nextInt();
        int input;
        for(int i = 1; i<=n; i++)
        {
            map.put(i, input = in.nextInt());
        }
        for(Map.Entry mymap:map.entrySet())
        {
            System.out.println("Key : "+mymap.getKey() +"Value : "+mymap.getValue());
        }
    }
}
