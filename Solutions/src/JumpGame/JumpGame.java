package JumpGame;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];
        return helper(0, nums, dp);
    }

    private boolean helper(int pos, int[] nums, int[] dp) {
        if (dp[pos] == 1) {
            return true;
        }
        if (dp[pos] == -1) {
            return false;
        }

        if (pos == nums.length - 1) {
            return true;
        }

        for (int i = 1; i <= nums[pos]; i++) {
            if (dp[pos + i] == 1) {
                return true;
            }
            if (dp[pos + i] == -1) {
                continue;
            }

            boolean canJump = helper(pos + i, nums, dp);
            if (canJump) {
                dp[pos + i] = 1;
                return true;
            } else {
                dp[pos + i] = -1;
            }
        }

        return false;
    }
}
