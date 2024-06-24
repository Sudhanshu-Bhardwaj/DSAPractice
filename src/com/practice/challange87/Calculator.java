package com.practice.challange87;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int x = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int y = sc.nextInt();

        try {
            int result = x / y;
            System.out.printf("Division of two number is %d", result);
        } catch (ArithmeticException ex) {
            if (ex.getMessage().equals("/ by zero")) {
                System.out.println("Divide by zero occured!!!");
            } else {
                throw ex;
            }
        }
    }
}
