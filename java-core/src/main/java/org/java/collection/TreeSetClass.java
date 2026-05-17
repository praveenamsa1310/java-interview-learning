/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java.collection;
import java.util.*;
/**
 *
 * @author PRAVEENAGRUD
 */
public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(54);
        set.add(65);
        set.add(54);
        set.add(65);
        set.add(32);
        set.add(12);
        set.add(76);
        set.add(99);
        set.add(84);
        System.out.println(set + " ");
        System.out.println("Size of TreeSet : "+set.size());
        Iterator i = set.descendingIterator();
        System.out.println("Desending order of TreeSet");
        while(i.hasNext())
        {
            System.out.print(i.next() + " ");
        }
        System.out.println("\nHead set : "+set.headSet(32,true));
       
    }
    
}
