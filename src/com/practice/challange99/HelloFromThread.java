package com.practice.challange99;

public class HelloFromThread extends Thread{
    private final int threadNumber;

    public HelloFromThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("(%d) %s Hello from Thread-%d\n",
                    (i+1), Thread.currentThread().getName(),
                    threadNumber);
        }
    }
}
