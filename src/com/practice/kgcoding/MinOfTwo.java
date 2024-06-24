package com.practice.kgcoding;

import java.util.Scanner;

public class MinOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();
        int min = minOfTwo(num1, num2);
        System.out.print("Minimum of two number is : " + min);
    }

    static int minOfTwo(int num1, int num2) {
        int min = num1 < num2 ? num1 : num2;
        return min;
    }
}
