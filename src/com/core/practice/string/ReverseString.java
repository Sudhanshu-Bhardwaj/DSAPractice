package com.core.practice.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String reversedString = reverseString(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseString(String input) {
        return Arrays.stream(input.split(""))
                .collect(Collectors.collectingAndThen(Collectors.toList(),
                        lst -> {
                            // Reverse the list and join it back into a string
                            java.util.Collections.reverse(lst);
                            return String.join("", lst);
                        }));
    }
//    public static String reverseString(String input) {
//        // Write your code here
//        char[] ch = new char[input.length()];
//        int index = 0;
//
//        for(int i = input.length() - 1; i >= 0; i-- ) {
//            ch[index++] = input.charAt(i);
//        }
//
//        return new String(ch);
//    }

}
