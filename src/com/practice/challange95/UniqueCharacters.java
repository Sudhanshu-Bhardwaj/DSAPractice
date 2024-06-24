package com.practice.challange95;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your String : ");
        String useStr = sc.next();
        for (char ch : useStr.toCharArray()) {
            unique.add(ch);
        }
        System.out.printf("Your String has %d unique characters", unique.size());
    }
}
