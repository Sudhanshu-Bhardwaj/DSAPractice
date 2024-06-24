package com.practice.challange87;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for division : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        try {
            System.out.println(divide(x, y));
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic Exception, Division by Zero!!!");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
//        if (b == 0) {
//            throw new ArithmeticException("Please enter number greater than 0!!!");
//        } else {
//
//        }
        return a / b;
    }
}
