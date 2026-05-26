package org.java.StreamsExample;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
//import java.util.stream.Collectors;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;



public class StreamsMainClass {
    public static void main(String[] args) {

        List<Person> people = getPeople();

        //Filter
        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
        females.forEach(System.out::println);

        List<Person> femalss = people.stream()
                .filter(p -> p.getGender().equals(Gender.FEMALE))
                        .toList();

        System.out.println("------------------------------------------------------");

        //Sort
        List<Person> sorted = people.stream()
//                .filter(person -> person.getGender().equals(Gender.MALE))
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName).reversed())
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);

        //All Match

        boolean allMatch = people.stream()
                .anyMatch(person -> person.getAge() > 20);
        System.out.println(allMatch);

        //Any match
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 50);
        System.out.println(anyMatch);

        //None Match
        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().equals("maven"));
        System.out.println(noneMatch);

        //Max value
       people.stream()
                .max(Comparator.comparing(Person::getAge))
               .ifPresent(System.out::println);
       //min Value
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        //Group

        Map<Gender, List<Person>> genderListMap= people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        genderListMap.forEach((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
        });

       Optional<String> optionalS = people.stream()
                .filter(person -> person.getGender().equals(Gender.MALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);
        optionalS.ifPresent(System.out::println);

        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7);

        List<Integer> integers1= integers.stream()
                .map(integer -> integer * 3)
                .collect(Collectors.toList());

        System.out.println(integers1);

        List<Integer> integers2 =  integers.stream()
                .map(integer -> integer * 3)
                .filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(integers2+"-----------");

        //Map

        integers.stream()
                .map(person -> person * 2)
                .forEach(System.out::println);

        //FlatMap
        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(3)
        );
        System.out.println(lists);
       List<Integer> integers3 = lists.stream()
                .flatMap(Collection::stream)
               .filter(integer -> integer % 1 == 0 )
               .collect(Collectors.toList());

        System.out.println(integers3);

        System.out.println(integers3.stream().reduce(Integer::sum));

        System.out.println(integers.stream()
//                .filter(integer -> integer % 5 == 0)
                .reduce(Integer::sum)
        );

        List<String> list = Arrays.asList("praveen", "laptop", "apple", "Orange");
        System.out.println(
                list.stream()
                        .map(String::toUpperCase)
                        .collect(Collectors.toList())
        );

        System.out.println(
                people.stream()
                        .collect(groupingBy(Person::getAge, mapping(Person::getName, toList())))
        );

        int value2 = integers.stream()
                .reduce(0, Integer::sum);
        System.out.println(value2);

        //forEach
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        //Map and ditinct
        List<Integer> integers4 = Arrays.asList(1,2,3,4,5,6,6,7,8);
        System.out.println(
                integers4.stream()
                        .map(n -> n * n).distinct()
                        .collect(toList())
        );

       int i = integers.stream()
//                .collect(Collectors.minBy(Comparator.naturalOrder()))
               .collect(Collectors.maxBy(Comparator.naturalOrder()))
                .get();
        System.out.println(i);


        List<String> strings = Arrays.asList("a","alpha","beta","gamma");

        Map<Boolean, List<String>> booleanListMap =  strings.stream()
                .collect(Collectors.partitioningBy(x -> x.length() > 2));
        System.out.println(booleanListMap);

        System.out.println(
                integers.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(","))
        );

        List<Long> longs = Arrays.asList(10l,10l,10l);
        System.out.println(
                longs.stream()
                        .collect(Collectors.averagingLong(x -> x))
        );

        // Implement the following
        // 1. Print the names of employees whose salary is above certain threshold(5000)
        System.out.println("1. Print the names of employees whose salary is above certain threshold(5000)");
        getEmployeeList().stream()
                .filter(e -> e.getSalary() > 5000)
                .map(Employee::getName)
                .forEach(System.out::println);

        // 2. Create a new list containing, employees with salary increase of 10%
        System.out.println("2. Create a new list containing, employees with salary increase of 10%");
        List<Employee> empSalaryHike = getEmployeeList().stream()
                .map(e -> new Employee(e.getId(), e.getName(), e.getSalary() + e.getSalary() * 0.10))
                .toList();
        System.out.println(empSalaryHike);


        Employee maxSalary = getEmployeeList().stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);
        // 3. Employee Having max salary
        System.out.println(maxSalary);

        Map<String, Double> groupedSalary = getEmployeeList().stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.summingDouble(Employee::getSalary)));

        Map<String, Double> groupedSalary2 = getEmployeeList().stream()
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary, Double::sum));
        for(Map.Entry<String, Double> entry: groupedSalary.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static List<Person> getPeople(){

        return List.of(
                new Person("praveen", 21, Gender.MALE),
                new Person("Lokesh", 24, Gender.MALE),
                new Person("Durga", 21, Gender.FEMALE),
                new Person("Dhanraj", 21, Gender.MALE)
        );
    }

    public static List<Employee> getEmployeeList () {

        return List.of(new Employee(1, "praveen", 5000),
                new Employee(2, "durga", 8000),
                new Employee(3, "theja", 6000),
                new Employee(4, "prasanth", 4000));
    }
}
