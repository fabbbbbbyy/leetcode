package MinCostClimbingStairs;

/* For submission, replace classname with Solution in Leetcode.*/

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] cache = new int[cost.length];
        for (int i = 0; i < cache.length; i++) {
            cache[i] = -1;
        }
        return Math.min(helper(0, cost, cache), helper(1, cost, cache));
    }

    private int helper(int pos, int[] cost, int[] cache) {
        if (pos >= cost.length) {
            return 0;
        }

        if (cache[pos] != -1) {
            return cache[pos];
        }

        cache[pos] = cost[pos] + Math.min(helper(pos + 1, cost, cache), helper(pos + 2, cost, cache));
        return cache[pos];
    }

    /*
    public int minCostClimbingStairs(int[] cost) {
        int[] minCost = new int[cost.length + 1];

        for (int i = 2; i < minCost.length; i++) {
            minCost[i] = Math.min(minCost[i - 1] + cost[i - 1], minCost[i - 2] + cost[i - 2]);
        }

        return minCost[cost.length];
    }
     */
}
