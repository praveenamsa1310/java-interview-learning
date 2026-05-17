/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java.LogicsString;
import java.util.*;
/**
 *
 * @author PRAVEENAGRUD75
 */
public class AnagramTwoString {
    public static void main(String []args)
    {
        String name1 = "abcdef";
        String name2 = "fedcba";
        char c1[] = name1.toCharArray();
        char c2[] = name2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        int c = 0;
        if(c1.length != c2.length)
        {
            System.out.println("False");
        }
        if(c1.length == c2.length)
        {
            for(int i =0; i<c1.length; i++)
            {     
                if(c1[i] == c2[i])
                    c++;
            }
            if(c == c1.length && c2.length == c)
            {
                System.out.println("True");
            }
            
        }
        
        
        
    }
}
