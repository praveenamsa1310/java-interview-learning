package org.java;

public class JavaMethods {

    public static void main(String[] args) {
        // A method is a block of code which only runs when it is called.
        System.out.println(myMethod("Static Method"));
        System.out.println(add(2, 2));
        System.out.println(add(2, 2, 2));

        System.out.println("Recursion : " + sum(10));
    }

    static String myMethod(String param) {
        return param;
    }

    // Method overloading
    static int add(int a, int b) {
        return a + b;
    }
    // Method overloading
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int sum (int a) {
        if (a > 0) {
            return a = a + sum(a - 1);
        } else {
            return 0;
        }
    }
}
