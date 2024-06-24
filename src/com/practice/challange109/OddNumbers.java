package com.practice.challange109;

import java.util.List;

public class OddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,8,9,5,7,4,10,23,22,10,23,7,5,3,1);
        numbers
                .stream()
                .filter(oddNumber -> oddNumber % 2 != 0)
                .forEach(oddNumber -> System.out.println(oddNumber));
    }
}
