package com.core.practice.interviewpractice;

public class Fibonnacci {

    public static void fibonacci(int n) {
        int a = 0, b = 1, c;
        if (n > 0) {
            System.out.print(a + " ");
        }
        if (n > 1) {
            System.out.print(b + " ");
        }
        for (int i = 0; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        fibonacci(5);
    }
}
