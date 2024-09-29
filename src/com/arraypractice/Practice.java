package com.arraypractice;

import java.util.*;

public class Practice {
    public static void main(String[] args) {

        int[] arr = {4, 8, 9, 7, 3, 6, 5, 2, 1};
        int target = 10;
        List<int[]> pairs = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int value : arr) {
            int complement = target - value;
            if (seen.contains(complement)) {
                pairs.add(new int[]{value, complement});
            }
            seen.add(value);
        }

        // Printing pairs in the desired format
        for (int[] pair : pairs) {
            System.out.println("[" + pair[0] + ", " + pair[1] + "]");
        }
    }
}
