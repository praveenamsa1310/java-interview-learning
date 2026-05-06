package org.java;

public class JavaThread extends Thread {

    public static int amount = 0;


    public static void main(String[] args) {
        JavaThread thread = new JavaThread();
        thread.start();
        // Wait for the thread to finish
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);

    }

    public void run() {
        System.out.println("This is inside Java thread");
        amount++;
    }
}
