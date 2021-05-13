package CombinationSumIV;

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
