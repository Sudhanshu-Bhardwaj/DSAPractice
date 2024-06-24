package com.core.practice;

import java.util.Scanner;

public class TextEditorThatDoesNotTakeSpecialChars {
        public static int countMisses(String textInput) {
            String allowedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
            int misses = 0;
            for (char c : textInput.toCharArray()) {
                if (allowedChars.indexOf(c) == -1) {
                    misses++;
                }
            }
            return misses;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();
            System.out.println(countMisses(userInput)); // Output: 3
        }
}
