package com.practice.challange108;

import java.util.List;

public class StringFilterAndConcatenate {
    public static void main(String[] args) {
        List<String> strs = List.of("StringFilter", "String", "StringAdder", "Adder",
                "abcdefghijkl", "Mobile", "Book", "StringFilter");
        String result = strs.stream()
                .filter(str -> str.length() > 10 )
                .reduce("", (a, b) -> a + " " + b);
        System.out.println(result);
    }
}
