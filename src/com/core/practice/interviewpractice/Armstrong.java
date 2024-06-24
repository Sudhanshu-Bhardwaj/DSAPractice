package com.core.practice.interviewpractice;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        sc.close();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        double sum = 0;
        int digits = Integer.toString(number).length();
        while(number != 0) {
            int digit = number % 10;
            sum = sum + Math.pow(digit, digits);
            number = number / 10;
        }
        return sum == originalNumber;
    }
}
