package com.core.practice.interviewpractice;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(-56));
        System.out.println(isPrime(23));
        System.out.println(isPrime(4));
        System.out.println(isPrime(75));
        System.out.println(isPrime(29));
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
