package SquaresOfASortedArray;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        int[] ans = new int[nums.length];
        int idx = nums.length - 1;

        while (left <= right) {
            if (Math.abs(nums[right]) >= Math.abs(nums[left])) {
                ans[idx] = nums[right] * nums[right];
                right--;
            } else {
                ans[idx] = nums[left] * nums[left];
                left++;
            }
            idx--;
        }

        return ans;
    }
}
