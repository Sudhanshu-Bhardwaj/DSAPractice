package com.arraypractice;

import java.util.ArrayList;
import java.util.HashSet;

public class SeparateDuplicateAndNonDuplicate {
    public static void main(String[] args) {
        int[] a = {8, 5, 6, 5, 8, 7, 8, 3, 2, 4, 5};

        ArrayList<Integer> duplicate = new ArrayList<>();
        ArrayList<Integer> nonDuplicate = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();

        for (int num : a) {
            if (seen.contains(num)) {
                if (!duplicate.contains(num)) {
                    duplicate.add(num);
                }
            } else {
                seen.add(num);
                nonDuplicate.add(num);
            }
        }

        System.out.println("Duplicate Elements:");
        duplicate.forEach(System.out::println);

        System.out.println("Non-Duplicate Elements:");
        nonDuplicate.forEach(System.out::println);
    }
}
