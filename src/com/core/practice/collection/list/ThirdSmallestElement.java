package com.core.practice.collection.list;

import java.util.Collections;
import java.util.List;

public class ThirdSmallestElement {
    // Function to find the third smallest element in the list
    public static int thirdSmallestElement(List<Integer> arr) {
        // Sort the list in ascending order
//        Collections.sort(arr);

        // Return the third element (index 2) in the sorted list
//        return arr.get(2);
        Integer thirdSmallest = arr.stream()
                .sorted()
                .skip(2)
                .findFirst()
                .get();
        return thirdSmallest;
    }

    public static void main(String[] args) {
        // Example list
        List<Integer> arr = List.of(1, 1, 1, 1, 2, 3, 4);

        // Call the function and print the result
        int thirdSmallest = thirdSmallestElement(arr);
        System.out.println("The third smallest element is: " + thirdSmallest);
    }
}
