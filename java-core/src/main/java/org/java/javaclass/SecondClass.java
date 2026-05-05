package org.java.javaclass;

public class SecondClass extends AbstractClass {
    int x;

    public SecondClass() {

    }

    public static void main(String[] args) {
        AbstractClass obj = new SecondClass();
        obj.printAbstractClass();

        EnumLevel myEnum = EnumLevel.LOW;
        System.out.println("myEnum = " + myEnum.getDescription());
    }

    public SecondClass(int x) {
        this.x = x;
    }

    public SecondClass(SecondClass secondClass) {
        System.out.println("Copy Constructor from SecondClass ");
    }

    @Deprecated
    public int  printXvalue() {
        System.out.println("Second Class : printXvalue: " + x);
        return x;
    }

    @Override
    public void printAbstractClass() {
        System.out.println("Second Class : printAbstractClass");
    }
}
