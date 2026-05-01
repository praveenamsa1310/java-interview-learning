package org.java.javaclass;

import java.util.Scanner;

public class JavaClass {
    int a;
    int b;

    public JavaClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main (String[] args) {
        JavaClass javaClass = new JavaClass(2, 4);
        System.out.println(javaClass.a + javaClass.b);

        javaClass.a = 50;

        SecondClass secondClass = new SecondClass(javaClass.a + javaClass.b);
        System.out.println("Second Class : " + secondClass.printXvalue());

        SecondClass secondClass2 = new SecondClass(secondClass);
        System.out.println("Second Class Copy Constructor : " + secondClass2.printXvalue());

        // Encapsulation
        Person person = new Person();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        sc.nextLine();

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        person.setName("Durga");
        System.out.println("Person Name : " + person.getName());
        System.out.println("Person Age : " +  age);

    }
}
