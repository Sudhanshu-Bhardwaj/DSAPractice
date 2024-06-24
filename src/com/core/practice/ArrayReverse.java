package com.core.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {5, 8, 7, 2, 89, 1, 6, 8};

        System.out.println("Original Array");
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
        System.out.println();

        System.out.println("Reversed Array");
        List<Integer> reversedList = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
        Collections.reverse(reversedList);
        reversedList.forEach(e -> System.out.print(e + " "));
    }
}
