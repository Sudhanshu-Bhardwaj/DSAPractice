package com.practice.challange110;

public class FunctionalTest {
    public static void main(String[] args) {
//        FunctionalTest ft = new FunctionalTest();
//        System.out.println(ft.checkPrime(19));
        CheckPrime checkPrime = num -> {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(checkPrime.checkPrime(5));
    }

//    @Override
//    public boolean checkPrime(int number) {
//        if (number < 2) {
//            return false; // Numbers less than 2 are not prime
//        }
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            if (number % i == 0) {
//                return false; // If divisible by any number, not prime
//            }
//        }
//        return true; // If not divisible by any number, prime
//    }
}
