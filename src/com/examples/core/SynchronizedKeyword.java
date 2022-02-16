package com.examples.core;

class Timer {
    int count = 0;

    //Adding synchronized to a method lets only one thread at a time to access it
    //to maintain data integrity
    synchronized void incrementer() {
        count++;
    }
}

public class SynchronizedKeyword {
    public static void main(String[] args) throws InterruptedException {
        Timer t = new Timer();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                t.incrementer();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                t.incrementer();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(t.count);
    }
}
