/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java.gkg;

/**
 *
 * @author PRAVEENAGRUD75
 */
public class SetPrecision {
    
  public static void main(String[] args) {
 
    double a = 0.9;
 
    // Setting the precision to 20 places
    System.out.println(
      String.format("%.20f", a));
 
    double b = 1;
 
    // Setting the precision to 5 places
    System.out.println(
      String.format("%.5f", b));
  }
}