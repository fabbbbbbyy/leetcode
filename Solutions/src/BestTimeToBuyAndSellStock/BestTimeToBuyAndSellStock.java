package BestTimeToBuyAndSellStock;

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
