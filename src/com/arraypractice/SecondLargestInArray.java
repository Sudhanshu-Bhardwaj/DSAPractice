package com.arraypractice;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {5, 8, 95, 75, 65, 82, 94, 76, 22, 45, 64, 12, 10};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Maximum : " + max);
        System.out.println("SecondMax : " + secondMax);
    }
}
