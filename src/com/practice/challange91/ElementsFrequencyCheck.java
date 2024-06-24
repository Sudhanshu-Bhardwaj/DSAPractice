package com.practice.challange91;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ElementsFrequencyCheck {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 7, 8, 1, 3, 1, 5, 8, 7, 8);
        System.out.println(Collections.frequency(list, 1));
        System.out.println(Collections.frequency(list, 8));
        System.out.println(Collections.frequency(list, 7));
    }
}
