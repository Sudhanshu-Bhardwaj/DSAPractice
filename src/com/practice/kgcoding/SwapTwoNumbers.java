package com.practice.kgcoding;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping : \na : " + a + "\nb : " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping : \na : " + a + "\nb : " + b);
    }
}
