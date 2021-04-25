/**
 * https://leetcode.com/problems/coin-change/
 *
 * Problem:
 * You are given an integer array coins representing coins of different denominations and an integer amount
 * representing a total amount of money.
 * Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up
 * by any combination of the coins, return -1.
 *
 * You may assume that you have an infinite number of each kind of coin.
 *
 * Insight: Sorting input might help to maintain invariants, even for DP problems.
 * When using Integer.MAX_VALUE as a flag and addition is possibly needed, remember to use 1L instead of 1
 * before comparison in case of integer overflow.
 */

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] cache = new int[amount + 1];
        int ans = helper(coins, amount, cache);
        if (ans == Integer.MAX_VALUE) {
            return -1;
        } else {
            return ans;
        }
    }

    public int helper(int[] coins, int amount, int[] cache) {
        if (amount == 0) {
            return 0;
        }

        if (cache[amount] != 0) {
            return cache[amount];
        }

        int minCoins = Integer.MAX_VALUE;
        for (int coin : coins) {
            if (coin > amount) {
                break;
            }

            int numCoins = helper(coins, amount - coin, cache);
            if (numCoins + 1L < minCoins) {
                minCoins = numCoins + 1;
            }
        }

        cache[amount] = minCoins;
        return minCoins;
    }
}
