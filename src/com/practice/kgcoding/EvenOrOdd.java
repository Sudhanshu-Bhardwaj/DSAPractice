package com.practice.kgcoding;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        String result = evenOrOdd(num);
        System.out.println("Number entered by you is : " + result);
    }

    static String evenOrOdd(int num){
        String result = num % 2 == 0 ? "Even" : "Odd";
        return result;
    }
}
