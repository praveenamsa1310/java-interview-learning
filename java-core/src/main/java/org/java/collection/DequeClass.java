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
public class DequeClass {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Zoo");
        deque.add("Get");
        deque.add("Handle");
        deque.add("Must have");
        deque.add("Get ready");
        deque.add("Priority");
        deque.add("Ant");
        System.out.println(deque +" ");
        deque.poll();
        System.out.println(deque +" ");
        deque.offerFirst("PD");
        System.out.println(deque +" ");
        deque.removeLast();
        System.out.println(deque +" ");
    }
    
}
 