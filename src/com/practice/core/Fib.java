package com.practice.core;

import java.util.Scanner;

public class Fib{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count <= i) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
