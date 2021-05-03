/**
 * https://leetcode.com/problems/house-robber-ii/
 *
 * Problem:
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed.
 * All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one.
 * Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police
 * if two adjacent houses were broken into on the same night.
 *
 * Given an integer array nums representing the amount of money of each house,
 * return the maximum amount of money you can rob tonight without alerting the police.
 *
 * Insight: An extension of HouseRobber.
 * Break HouseRobber into 2 cases.
 * 1. Rob first house -> Cannot rob last house -> Don't include last house in dp.
 * 2. Don't rob first house -> Can rob last house -> Include last house in dp.
 * 3. Take the max of both. 
 */

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length - 1; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        int[] dpRob = new int[nums.length];
        dpRob[0] = 0;
        dpRob[1] = nums[1];
        dpRob[2] = Math.max(nums[1], nums[2]);

        for (int i = 3; i < nums.length; i++) {
            dpRob[i] = Math.max(dpRob[i - 1], dpRob[i - 2] + nums[i]);
        }

        return Math.max(dp[nums.length - 2], dpRob[nums.length - 1]);
    }
}
