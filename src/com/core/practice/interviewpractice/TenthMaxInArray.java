package com.core.practice.interviewpractice;

import java.util.Arrays;
import java.util.Collections;

public class TenthMaxInArray {
    public static void main(String[] args) {
        Integer[] array = {1, 4, 17, 7, 25, 3, 100, 50, 40, 99, 2, 6, 33, 75, 88, 8, 16};

        // Check if the array has at least 10 elements
        if (array.length < 10) {
            System.out.println("Array doesn't have at least 10 elements.");
            return;
        }

        // Sort the array in descending order
        Arrays.sort(array, Collections.reverseOrder());

        // Retrieve the 10th maximum element (9th index in 0-based index)
        int tenthMax = array[9];

        System.out.println("The 10th maximum element is: " + tenthMax);
    }
}
