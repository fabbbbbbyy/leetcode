package MaximumSubarray;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int currentMax = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i] + currentMax, nums[i]);
            maxSum = Math.max(currentMax, maxSum);
        }
        return maxSum;
    }
}
