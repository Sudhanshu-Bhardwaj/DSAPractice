package com.core.practice.interviewpractice;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 4, 9, 2, 8, 8, 7, 6, 6, 8, 8, 9, 9, 2};
        int secondLargest = secondLargest(arr);
        System.out.println(secondLargest);
    }
    public static int secondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain atleast 2 element");
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            throw new RuntimeException("No second largest element found");
        }
        return secondLargest;
    }
}
