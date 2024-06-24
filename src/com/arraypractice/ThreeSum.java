/*
Given an integer array nums, return all the triplets
[nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.


Constraints:

3 <= nums.length <= 3000
-105 <= nums[i] <= 105
 */

package com.arraypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    static int[] nums = {-1, 0, 1, 2, -1, -4};
    public static void main(String[] args) {


    }
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List al = new ArrayList<>();
        for (int i = 0; i < n - 2; i++){
            for (int j = i + 1; j < n -1; j++) {
                for (int k = i + 2; k < n; k++) {
                    if (nums[i] == 0 && nums[j] == 0 && nums[k] == 0) {
                        int[] arr = {nums[i] , nums[j], nums[k]};
                        al = Arrays.asList(arr);
                        return al;
                    }
                    if (nums[i] + nums[j] + nums[k] == 0
                            && nums[i] != nums[j]
                            && nums[i] != nums[k]
                            && nums[k] != nums[j]) {
                        int[] arr = {nums[i] , nums[j], nums[k]};
                        al = Arrays.asList(arr);
                        return al;
                    }
                }
            }
        }
        return al;
    }
}
