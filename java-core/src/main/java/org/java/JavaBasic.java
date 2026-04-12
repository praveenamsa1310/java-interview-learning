package org.java;

public class JavaBasic {
    public static void main (String[] args) {
        System.out.println("Java Comments");
        // single line comment
        /*
         * Multiline comment
         */

        System.out.println("Primitive Data Types");
        // -------- Primitive Data Types --------
        byte b = 100;              // 1 byte
        short s = 30000;           // 2 bytes
        int i = 100000;            // 4 bytes
        long l = 10000000000L;     // 8 bytes

        float f = 3.14f;           // 4 bytes
        double d = 3.14159265359;  // 8 bytes

        char c = 'A';              // 2 bytes (Unicode character)
        boolean flag = true;       // 1 bit

        // -------- Non-Primitive Data Types --------
        String str = "Hello, Java"; // String (class in Java)
        int[] arr = {1, 2, 3, 4, 5}; // Array
        Integer wrapperInt = Integer.valueOf(50); // Wrapper class example
        StringBuilder sb = new StringBuilder("Java"); // Class object

        // -------- Output --------
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);
        System.out.println("str: " + str + flag);

        System.out.println("String: " + str);
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("StringBuilder: " + sb);

        // Java Strings
        String myString = "Hello, Java";
        System.out.println("Length of string: " + myString.length());
        String[] my = myString.split(",");
        for (String string : my) {
            System.out.println(string);
        }
        System.out.println("upper and lower case " + myString.toLowerCase() + " " + myString.toUpperCase());
        System.out.println("String special \n char \' \\ \"");

        System.out.println("Java Math");
        System.out.println("Math.max: " + Math.max(5, 10));
        System.out.println("Math.min: " + Math.min(5, 10));
        System.out.println("Math.sqrt: " + Math.sqrt(64));
        System.out.println("Math.random * 101 (rounded): " + Math.round(Math.random() * 101));
        System.out.println("Math.pow: " + Math.pow(2, 8));
        System.out.println("Math.round: " + Math.round(4.8));
        System.out.println("Math.abs: " + Math.abs(-5.3));

        System.out.println("if ");
        if (5 == 10) {
            System.out.println("true");
        }

        int a = 200;
        int bbb = 33;
        int ccc = 500;

        if (a > bbb && ccc > a) {
            System.out.println("Both conditions are true");
        }
        System.out.println("Switch Case");
        switch (a) {
            case 200:
                System.out.println("200");
                break;
            case 100:
                System.out.println("100");
                break;
            default:
                System.out.println("default value");
        }

        System.out.println("While Loop");
        while (a >= bbb) {
            System.out.println("While Loop : " + bbb);
            bbb += 100;
        }
        int dice = 1;

        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
            dice = dice + 1;
        }

    }

}
