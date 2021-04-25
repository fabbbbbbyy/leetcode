/**
 * https://leetcode.com/problems/longest-increasing-subsequence/
 *
 * Problem:
 * Given an integer array nums, return the length of the longest strictly increasing subsequence.
 *
 * A subsequence is a sequence that can be derived from an array by deleting some or no elements without
 * changing the order of the remaining elements. For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].
 *
 * Insight: Reminder not to overly complicate problem statements. Only resort to bruteforce-like approaches
 * when all else fails. Use wishful thinking to assume we have the maxLIS of previous subsequences, and use a bottom
 * up approach.
 */

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
