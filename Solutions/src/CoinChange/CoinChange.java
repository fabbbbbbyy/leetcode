package CoinChange;

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
