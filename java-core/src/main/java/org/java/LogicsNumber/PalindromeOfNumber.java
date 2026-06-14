package org.java.LogicsNumber;
import java.util.*;
/**
 *
 * @author PRAVEENAGRUD75
 */
public class PalindromeOfNumber {
    public static void main(String []args)
    {
         int n = 1234, r = 0;
        while(n !=0 )
        {
            r = r*10;
            System.out.println(r);
            r = r + n % 10;
            System.out.println(r);
            n = n/10;
            System.out.println(r);
        }
        System.out.println(r);
    }
}
