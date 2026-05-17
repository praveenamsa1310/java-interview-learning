/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java.collection;
import java.util.*;
/**
 *
 * @author PRAVEENAGRUD75
 */
public class HashSetClass {
    public static void main(String[] args) {
        Set<String> set = new HashSet();
        set.add("aaaa");
        set.add("bbbbbb");
        set.add("ccc");
        set.add("ddd");
        set.add("ccc");
         System.out.println(set);
        Iterator it = set.iterator();
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }
    }
    
}
