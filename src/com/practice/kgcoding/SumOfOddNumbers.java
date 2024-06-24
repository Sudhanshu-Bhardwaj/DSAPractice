package com.practice.kgcoding;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the number upto which you want sum : ");
        int number = sc.nextInt();
        SumOfOddNumbers oddSum = new SumOfOddNumbers();
        oddSum.sumOfOddNumbers(number);
    }

    public void sumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
