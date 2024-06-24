package com.practice.kgcoding;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two number for arithmetic operations : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sum(num1, num2);
        int subtract = subtract(num1, num2);
        System.out.println("Difference of two number entered above is : " + subtract);
        int multiply = multiply(num1, num2);
        System.out.println("Product of two number entered above is : " + multiply);
        divide(num1, num2);
    }

    static void sum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of two number entered above is : " + sum);
    }
    static int subtract(int a, int b) {
        int subtract = a - b;
        return subtract;
    }
    static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }
    static void divide(int a, int b) {
        int division = a / b;
        System.out.println("Division of two number entered above is : " + division);

    }
}
