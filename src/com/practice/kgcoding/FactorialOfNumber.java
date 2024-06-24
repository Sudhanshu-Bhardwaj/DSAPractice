package com.practice.kgcoding;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int number = sc.nextInt();
        FactorialOfNumber factorialNumber = new FactorialOfNumber();
//        factorialNumber.factorial(number);
        System.out.println(factorialNumber.factorialRecursion(number));
    }

    public void factorial(int n) {
        int fact = 1;
        for(int i = n; i >= 1; i--){
            fact *= i;
        }
        System.out.println(fact);
    }

    public int factorialRecursion(int n) {
        if(n == 0){
            return 1;
        } else {
            return(n * factorialRecursion(n - 1));
        }
    }
}
