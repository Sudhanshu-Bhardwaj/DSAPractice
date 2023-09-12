package com.practice.core;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take input from user till user does not press X or x

        int ans = 0;
        while(true) {
            //take the operator as input from user
            System.out.print("Enter the Operation to be done : ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter the 1st Number : ");
                int num1 = sc.nextInt();
                System.out.print("Enter the 2nd Number : ");
                int num2 = sc.nextInt();

                if(op == '+') {
                    ans = num1 + num2;
                }
                if(op == '-') {
                    ans = num1 - num2;
                }
                if(op == '*') {
                    ans = num1 * num2;
                }
                if(op == '/') {
                    if(num2 != 0){
                        ans = num1 / num2;
                    }
                }
                if(op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'X' || op == 'x') {
                break;
            } else {
                System.out.println("Invalid Operation !!");
            }
            System.out.println(ans);
        }
    }
}
