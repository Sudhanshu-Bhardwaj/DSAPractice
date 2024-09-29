package com.core.practice.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortString {
    public static void main(String[] args) {
        String[] s = {"Dog", "Cat", "Elephant", "Ant", "Bee", "Cow"};
        List<String> sortedList = Arrays.asList(s).stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
