package org.java.StreamsExample;

import org.java.javaCollection.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JavaStream {

    public static void main(String[] args) {

        // first highest age
        org.java.javaCollection.Person highAge = getPersons().stream()
                .max(Comparator.comparing(org.java.javaCollection.Person::getAge)).orElse(null);

        System.out.println(highAge);

        // second highest age
        org.java.javaCollection.Person i = getPersons().stream()
                .sorted(Comparator.comparing(org.java.javaCollection.Person::getAge).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(i);

    }


    public static List<org.java.javaCollection.Person> getPersons(){
        return new ArrayList<>(Arrays.asList(
                new org.java.javaCollection.Person("kumar", 25, "Dev"),
                new org.java.javaCollection.Person("arun", 30, "QA"),
                new org.java.javaCollection.Person("sneha", 28, "HR"),
                new Person("rrrr", 28, "HR")

        ));
    }
}
