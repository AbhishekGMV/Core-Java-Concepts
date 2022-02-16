package com.examples.core;

class Turtle extends Thread {
    int score;

    //Run method will be executed by the Thread
    @Override
    public void run() {
        try {
            for (score = 0; score <= 10; score++) {
                System.out.println(score);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Rabbit implements Runnable {
    int score;

    @Override
    public void run() {
        try {
            for (score = 0; score <= 10; score++) {
                System.out.println(score);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MultiThreading {
    //Threading is used to make use of all CPU cores effectively
    //Java by default has the main thread.
    //Main thread in-turn invokes other threads

    public static void main(String[] args) throws Exception {
        Turtle turtle = new Turtle(); //Thread object
//        Runnable rabbit = new Rabbit(); //Can be referenced as Runnable as it is a Thread

        Thread t1 = new Thread(turtle);

        //Creating thread by lambda expression
        //This works as Runnable interface has only one method, run()
        Runnable rabbit = new Thread(() -> {
            try {
                for (int score = 0; score <= 10; score++) {
                    System.out.println(score);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Rabbit thread");         //Setting name to a thread


        Thread t2 = new Thread(rabbit);

        t1.setName("Turtle thread");
        //t1.getName();

        //Set priority to a thread 1->10 or MIN/MAX_PRIORITY
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);


        //Starting the thread
        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception ignored) {
        }

        t2.start(); //run() method as it implements runnable interface

        //System.out.println("Race finished!"); //Main method prints this in the main thread

        //join method waits for the thread to finish executing
        //and join back to the main thread
        t1.join();
        t2.join();

        //Check if threads are active
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());

        System.out.println("Race finished!");
    }
}
