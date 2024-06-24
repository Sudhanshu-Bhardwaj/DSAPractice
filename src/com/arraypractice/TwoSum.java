package com.arraypractice;

public class TwoSum {
    static int[] a = {2, 5, 8, 7, 9 ,10};

    public static void main(String[] args) {
        int[] b = twoSum(a, 19);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
