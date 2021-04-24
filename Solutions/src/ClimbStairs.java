/**
 * https://leetcode.com/problems/climbing-stairs/
 *
 * Problem:
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Insight: Straightforward recursion with memoization. If you want to be fancy, you can call it DP.
 */

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
