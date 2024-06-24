package com.practice.kgcoding;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number for the table you want : ");
        int number = sc.nextInt();
        MultiplicationTable table = new MultiplicationTable();
        table.multiplicationTable(number);
    }

    public void multiplicationTable(int n) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
