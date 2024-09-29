package com.core.practice;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 7;
        System.out.print(a + " " + b);
        for (int i = 2; i < c; i++) {
            int d = a + b;
            a = b;
            b = d;
            System.out.print(" " + d);
        }
    }
}
