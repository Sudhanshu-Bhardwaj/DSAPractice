package com.practice.lecturepractice.multithreading.threadclass;

public class ExtendingThreadClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        MyFirstThread t1 = new MyFirstThread();
        MySecondThread t2 = new MySecondThread();
        MyThirdThread t3 = new MyThirdThread();

        System.out.println("\nStarting First Thread");
        t1.start();
        System.out.println("\nStarting Second Thread");
        t2.start();
        System.out.println("\nStarting Third Thread");
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total time taken: %d",
                Thread.currentThread().getName(),
                (endTime - startTime));
    }
}
