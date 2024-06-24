package com.core.practice;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringCharacterReplace {
    public static void main(String[] args) {
        String original = "example";
        String reversed = reverseString(original);
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String input) {
        return IntStream.range(0, input.length())
                .mapToObj(i -> input.charAt(input.length() - 1 - i))
                .collect(Collectors.collectingAndThen(Collectors.toList(),
                        lst -> {
                            StringBuilder sb = new StringBuilder(lst.size());
                            lst.forEach(sb::append);
                            return sb.toString();
                        }));
    }
}
