package org.java.javaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream {

    public static void main(String[] args) {

        // first highest age
        Person highAge = getPersons().stream()
                .max(Comparator.comparing(Person::getAge)).orElse(null);

        System.out.println(highAge);

        // second highest age
        Person i = getPersons().stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(i);

    }


    public static List<Person> getPersons(){
        return new ArrayList<>(Arrays.asList(
                new Person("kumar", 25, "Dev"),
                new Person("arun", 30, "QA"),
                new Person("sneha", 28, "HR"),
                new Person("rrrr", 28, "HR")

        ));
    }
}
