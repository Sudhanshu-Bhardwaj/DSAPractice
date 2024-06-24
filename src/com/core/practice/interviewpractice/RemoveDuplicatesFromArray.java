package com.core.practice.interviewpractice;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] a = {1, 8, 9, 7, 2, 6, 9, 8, 5, 0, 5, 0, 0, 7, 1, 6, 6, 9, 2};
        int[] temp = new int[a.length];
        int j = 0;
        if (a.length == 0 || a.length == 1) {
            throw new IllegalArgumentException("Array Size is either 0 or 1");
        }
        Arrays.sort(a);
        temp[j++] = a[0];
        for (int i = 1; i < a.length; i++){
            if (a[i] != a[i - 1]) {
                temp[j++] = a[i];
            }
        }

        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
