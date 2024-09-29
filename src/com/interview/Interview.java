package com.interview;

public class Interview {
    public static int solution(int[] visits, int target) {
        int cumulativeSum = 0;

        for (int i = 0; i < visits.length; i++) {
            cumulativeSum += visits[i];
            if (cumulativeSum >= target) {
                return i;  // return the index of the day when the target is met or exceeded
            }
        }

        // If the target is never met or exceeded, return -1 (or some other indicator)
        return -1;
    }

    public static void main(String[] args) {
        int[] visits = {300, 200, 100, 200, 500};
        int target = 700;
        System.out.println(solution(visits, target));  // Output should be 3
    }
}
