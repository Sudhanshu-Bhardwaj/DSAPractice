package com.core.practice;

public class Palindrome {
    public static void main(String[] args) {
        int number = 121;
        int originalNumber = number;
        int reversedNumber = 0;
        while(number > 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number = number / 10;
        }
        if (reversedNumber == originalNumber) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
