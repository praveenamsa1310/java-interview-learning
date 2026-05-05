package org.java.javaJenerics;

public class JavaGenerics {

    public static void main(String[] args) {

        Box<String> boxStr = new Box<>();
        boxStr.setValue("Tamil");
        System.out.println(boxStr.getValue());


        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(123);
        System.out.println(integerBox.getValue());
    }
}
