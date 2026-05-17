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
public class ArrayListClass {
    public static void main(String[] args){
        int temp, getValue, op;
        Scanner getInput = new Scanner(System.in);
        ArrayList<Integer> arrlist = new ArrayList<Integer>();        
        while(true){
            System.out.print("ARRAY LIST\n1.Insert a Record\n2.Delete A Record\n3.Display a Record\n4.Exit"
                + "\nSelect your Option -->");
            op = getInput.nextInt();
            System.out.println("************************************************************");
            if(op == 1){
                System.out.print("How many numbers you want to add in Array List : ");
                temp = getInput.nextInt();
                for(int i = 1; i <= temp; i++){
                    System.out.print("Enter "+i+" Element : ");
                    getValue = getInput.nextInt();
                    arrlist.add(getValue);
                }
                System.out.println("************************************************************");
            }
            if(op == 2){
                int a;
                System.out.print("Enter Inde x : ");
                a = getInput.nextInt();
                arrlist.remove(a-1);
                System.out.println("Element deleted sucessfully !!!");
                System.out.println("************************************************************");
            }
            if(op == 3){
                for(int i  = 0; i < arrlist.size(); i++){
                    System.out.print(arrlist.get(i)+",");
                }
                //System.out.println("ArrayList : "+arrlist);
                System.out.println("  -----> Size of ArraylList : "+arrlist.size());
                System.out.println("************************************************************");
            }
            if(op == 4){
                break;                
            }
        }
    }
}
