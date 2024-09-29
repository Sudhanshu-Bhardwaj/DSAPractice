package com.interview.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EvenFromArrayInDescendingOrder {
    public static void main(String[] args) {
        int[] arr = {8, 6, 2, 1, 9, 7, 4, 5, 3, 84, 94, 45, 15, 35, 87, 25, 24, 16, 52, };
        // Step 1: Segregate even numbers to the front of the array
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                // Swap arr[i] with arr[count]
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        // Step 2: Sort the even numbers in descending order using a simple sorting algorithm
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (arr[i] < arr[j]) {
                    // Swap to arrange in descending order
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Print the sorted even numbers
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }

//        int[] evenArr = new int[arr.length];
//        int count = 0;
//        for (int num : arr) {
//            if (num % 2 == 0) {
//                evenArr[count++] = num;
//            }
//        }
//        for (int i = 0; i < count - 1; i++) {
//            for (int j = i + 1; j < count; j++) {
//                if (evenArr[i] < evenArr[j]) {
//                    int temp = evenArr[i];
//                    evenArr[i] = evenArr[j];
//                    evenArr[j] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < count; i++) {
//            System.out.print(evenArr[i]);
//            if (i < count - 1) {
//                System.out.print(", ");
//            }
//        }

//        List<Integer> evenArrayInDescending = Arrays.stream(arr)
//                .boxed()
//                .filter(a -> a % 2 == 0)
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList());
//
//        System.out.println(evenArrayInDescending);
    }
}
