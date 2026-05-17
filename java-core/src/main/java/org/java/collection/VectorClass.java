/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java.collection;
import java.util.*;
/**
 *
 * @author WINDOWS
 */
public class VectorClass {
    public static void main(String[] args){
        Vector<Integer> vec = new Vector<>();
        Vector<Integer> vec1 = new Vector<>();
        vec1.add(3);
        vec1.add(54);
        vec1.add(65);
        vec1.add(43);
        vec1.add(65);
        vec.add(1);
        System.out.println("Vector Elements : "+vec);
        vec.addAll(vec1);
        System.out.println("Vector size "+vec.size());
        System.out.println("After adding 2 Vectors Elements : "+vec);
        System.out.println("Vector Conteaind method : "+vec.contains(43));
        System.out.println("Vector firstElement "+vec.firstElement());
        System.out.println("Index of 65 : "+vec.indexOf(65));
        System.out.println("Vector remove method : "+vec.removeElement(54));
        System.out.println("Vector Elements After removed 54 : "+vec);
        System.out.println("Vector size "+vec.size());        
    }    
}
