package com.practice.core;

public class NumberOfOccuranceOfAnyNumber {
    public static void main(String[] args) {
        int n = 177577267;
        int rem = 0;
        int count = 0;
        while(n > 0) {
            rem = n % 10;
            if(rem == 7){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
