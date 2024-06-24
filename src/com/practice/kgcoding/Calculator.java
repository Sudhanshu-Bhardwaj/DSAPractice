package com.practice.kgcoding;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first number : ");
        int first = sc.nextInt();
        System.out.print("Please enter the second number : ");
        int second = sc.nextInt();
        System.out.print("Please enter the operation you want to perform : ");
        char operation = sc.next().charAt(0);
        calculate(first, second, operation);

    }

    static void calculate(int a, int b, char operation) {
        int output = switch (operation) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> -1;
        };
        System.out.println(output);
    }
}
