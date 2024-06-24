package com.practice.kgcoding;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the digit : ");
        int digit = sc.nextInt();
        sumOfDigit(digit);
    }

    public static void sumOfDigit(int digit) {
        int sum = 0;
        while (digit != 0) {
            sum += digit % 10;
            digit = digit / 10;
        }
        System.out.println(sum);
    }
}
