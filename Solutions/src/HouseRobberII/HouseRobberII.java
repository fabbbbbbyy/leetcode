package HouseRobberII;

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
