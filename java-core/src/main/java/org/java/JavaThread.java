package org.java;

class CookingTask extends Thread {
    private String task;

    CookingTask(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println(task + " is being prepared by " +
                Thread.currentThread().getName());
    }
}

public class JavaThread implements Runnable{

    public static int amount = 0;

    public static void main(String[] args) throws InterruptedException {



        JavaThread thread = new JavaThread();

        Thread t1 = new Thread(thread);
        t1.start();
        // Wait for the thread to finish
        while(t1.isAlive()) {
            System.out.println("Waiting...");
        }

        Thread t8 = new CookingTask("Pasta");
        Thread t2 = new CookingTask("Salad");
        Thread t3 = new CookingTask("Dessert");
        Thread t4 = new CookingTask("Rice");

        t8.start();
        t2.start();
        t3.start();
        t4.start();
        // Update amount and print its value
        System.out.println("Main: " + amount);
//        Thread.sleep(5000);
         amount++;
        System.out.println("Main: " + amount);

//        stackOverFlowTest();

    }

    private static void stackOverFlowTest() {
        while (1 != 2) {
            stackOverFlowTest();
        }
    }

    @Override
    public void run() {
        System.out.println("This is inside Java thread");
        amount++;
    }
}
