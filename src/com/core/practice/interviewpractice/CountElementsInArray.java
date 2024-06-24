package com.core.practice.interviewpractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountElementsInArray {
    public static void main(String[] args) {
        int[] a = {4, 8, 7, 9, 8, 7, 6, 4, 2, 9, 4, 8, 6, 9, 1};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }
}
