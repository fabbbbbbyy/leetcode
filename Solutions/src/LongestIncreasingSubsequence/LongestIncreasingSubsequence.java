package LongestIncreasingSubsequence;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;

        for (int i = 0; i < nums.length; i++) {
            int currMax = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    currMax = Math.max(currMax, dp[j] + 1);
                }
            }
            dp[i] = Math.max(currMax, dp[i]);
        }

        int maxLIS = 1;
        for (int i = 0; i < dp.length; i++) {
            maxLIS = Math.max(maxLIS, dp[i]);
        }
        return maxLIS;
    }
}
