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
public class PriorityQueueClass {
    public static void main(String[] args){
        Queue<String> queue = new PriorityQueue<String>();
        queue.add("Zoo");
        queue.add("Get");
        queue.add("Handle");
        queue.add("Must have");
        queue.add("Get ready");
        queue.add("Priority");
        queue.add("Ant");
        System.out.println("Head : "+queue.element());
        System.out.println("Head : "+queue.peek());
        System.out.print(queue);
        Iterator itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
