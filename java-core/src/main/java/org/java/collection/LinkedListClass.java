/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java.collection;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author WINDOWS
 */
public class LinkedListClass {
    public static void main(String[] args){
        int temp, getValue, op;
        Scanner getInput = new Scanner(System.in);
        LinkedList<Integer> linkedlist = new LinkedList<>();        
        while(true){
            System.out.print("LINKED LIST\n1.Insert a Record\n2.Delete A Record\n3.Display a Record\n4.Exit"
                + "\nSelect your Option -->");
            op = getInput.nextInt();
            System.out.println("************************************************************");
            if(op == 1){
                System.out.print("How many numbers you want to add in Linked List : ");
                temp = getInput.nextInt();
                for(int i = 1; i <= temp; i++){
                    System.out.print("Enter "+i+" Element : ");
                    getValue = getInput.nextInt();
                    linkedlist.add(getValue);
                }
                System.out.println("************************************************************");
            }
            if(op == 2){
                int a;
                System.out.print("Enter Index : ");
                a = getInput.nextInt();
                linkedlist.remove(a-1);
                System.out.println("Element deleted sucessfully !!!");
                System.out.println("************************************************************");
            }
            if(op == 3){
                for(int i  = 0; i < linkedlist.size(); i++){
                    System.out.print(linkedlist.get(i)+",");
                }
                //System.out.println("LinkeList : "+linkedlist);
                System.out.println("  -----> Size of LinkedList : "+linkedlist.size());
                System.out.println("************************************************************");
            }
            if(op == 4){
                break;                
            }
        }
    }
    
}
