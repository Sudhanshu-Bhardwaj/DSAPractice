package com.practice.core;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i <= 1) {
            System.out.println("Neither Prime nor Composite");
            System.exit(0);
        }
        int c = 2;
        while (c * c <= i){
            if(i % c == 0) {
                System.out.println("Not Prime");
                System.exit(0);
            }
            c += 1;
        }
        System.out.println("Prime");

    }
}
