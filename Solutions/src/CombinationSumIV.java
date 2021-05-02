/**
 * https://leetcode.com/problems/combination-sum-iv/
 *
 * Problem:
 * Given an array of distinct integers nums and a target integer target,
 * return the number of possible combinations that add up to target.
 *
 * The answer is guaranteed to fit in a 32-bit integer.
 *
 * Insight: Recursion with memoization. Initialize array to negative 1s because the number
 * of ways for previously computed targets might be 0. 
 *
 */

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class CombinationSumIV {
    public int combinationSum4(int[] nums, int target) {
        int[] cache = new int[target + 1];
        for (int i = 0; i < cache.length; i++) {
            cache[i] = -1;
        }
        return helper(nums, target, cache);
    }

    private int helper(int[] nums, int target, int[] cache) {
        if (cache[target] != -1) {
            return cache[target];
        }

        if (target == 0) {
            return 1;
        }

        int numWays = 0;
        for (int num : nums) {
            int nextTarget = target - num;
            if (nextTarget >= 0) {
                cache[nextTarget] = helper(nums, nextTarget, cache);
                numWays += cache[nextTarget];
            }
        }

        cache[target] = numWays;
        return numWays;
    }
}
