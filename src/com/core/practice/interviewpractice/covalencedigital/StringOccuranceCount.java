package com.core.practice.interviewpractice.covalencedigital;

import java.util.Arrays;

public class StringOccuranceCount {
    public static void main(String[] args) {
        String[] a = {"frogged", "egged", "edged", "stringed", "welledged"};
        String y = "ed";
        int count = 1;

        Arrays.stream(a).forEach(e -> e.contains(y));
    }

    int sum(int a, int b) {
        return a + b;
    }

    Integer sum(Integer a, Integer b) {
        return a + b;
    }
}
