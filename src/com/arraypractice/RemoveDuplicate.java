package com.arraypractice;

public class RemoveDuplicate {

    public int removeDuplicates(int[] nums) {
        int[] temp = new int[nums.length];
        int a = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    temp[a++] = nums[j];
                }
            }
        }
        int k = temp.length;
        return k;
    }
}
