package org.java.javaclass;

public class BikeInterfaceImpl implements BikeInterface {

    public static void main(String[] args) {
        BikeInterfaceImpl obj = new BikeInterfaceImpl();
        obj.printBikeInheritance();
    }

    @Override
    public void printBikeInheritance() {
        System.out.println("BikeInterfaceImpl.printBikeInheritance()");
    }
}

