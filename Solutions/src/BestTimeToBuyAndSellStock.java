/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 * Problem:
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * Insight: Maximum profit of one transaction is the difference of the lowest valley and the highest peak.
 */

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lowestValley = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < lowestValley) {
                lowestValley = prices[i];
            } else if (prices[i] - lowestValley > maxProfit) {
                maxProfit = prices[i] - lowestValley;
            }
        }
        return maxProfit;
    }
}
