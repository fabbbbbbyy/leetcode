package ClimbStairs;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class ClimbStairs {
    public int climbStairs(int n) {
        int[] cache = new int[n + 1];
        return helper(n, cache);
    }
    public int helper(int n, int[] cache) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (n == 2) {
            return 2;
        }

        if (cache[n] != 0) {
            return cache[n];
        }

        cache[n] = helper(n - 1, cache) + helper(n - 2, cache);

        return cache[n];
    }
}
