package com.practice.challange99;

public class TestingThread {
    public static void main(String[] args) {
        HelloFromThread t1 = new HelloFromThread(1);
        HelloFromThread t2 = new HelloFromThread(2);

        t1.start();
        t2.start();
    }
}
