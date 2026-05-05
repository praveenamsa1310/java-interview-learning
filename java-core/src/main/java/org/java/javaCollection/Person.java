package org.java.javaCollection;

public class Person {

    String name;
    int age;
    String department;


    public Person(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Person{name='" + this.name + "', age=" + this.age + ", role='" + this.department + "'}";
    }
}
