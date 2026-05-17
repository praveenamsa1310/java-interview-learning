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
public class StackClass {
    public static void main(String[] args){
        //creating an object of Stack class
        Stack<Integer> stk = new Stack<>();
        System.out.println("Stack : " + stk);
        //pushing elements
        pushElement(stk, 23);
        pushElement(stk, 54);
        pushElement(stk, 56);
        pushElement(stk, 87);
        pushElement(stk, 43);
        pushElement(stk, 98);
        pushElement(stk, 90);
        pushElement(stk, 80);
        popElement(stk);
        popElement(stk);
        try{
            popElement(stk);
        }
        catch(EmptyStackException e){
            System.out.println("Empty stack");
        }
        System.out.println("Size of the stack is : "+stk.size());
        int temp = stk.peek();
        System.out.println("Peek element : "+temp);
        System.out.println("Stack : "+stk);
        //pushing elements into the stac
        int location = stk.search(56);
        System.out.println("Location of 56 : "+location);
        ListIterator<Integer> ListIterator = stk.listIterator(stk.size());
        System.out.println("Iteration over the stack from top to bottom");
        while(ListIterator.hasPrevious()){
            Integer avg = ListIterator.previous();
            System.out.print(avg +" ");
        }
        System.out.println();
        
    }
    static void pushElement(Stack stk, int x){
        //Invoking push() method
        stk.push(x);
        System.out.println("push ->"+x);
        //Prints modified stack
        System.out.println("Stack: "+stk);        
    }
    static void popElement(Stack stk){
        //Performing pop operation
        System.out.print("pop ->");
        Integer x = (Integer)stk.pop();
        System.out.println(x);
        System.out.println("Stack : "+stk);
    }
    
}
