package org.java;

import java.util.ArrayList;
import java.util.function.Consumer;

public class JavaLambda {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((n) -> System.out.println(n));

        Consumer<Integer> method = System.out::println;

        numbers.forEach(method);
    }
}
