/**
 * https://leetcode.com/problems/maximum-product-subarray/
 *
 * Problem:
 * Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product,
 * and return the product.
 * It is guaranteed that the answer will fit in a 32-bit integer.
 * A subarray is a contiguous subsequence of the array.
 *
 * Insight: Contiguous subarrays tend to involve either the Kadene's or Sliding Window technique.
 * Encountering a zero would mean restarting the contiguous section from the following element.
 * Hitting a negative number does not necessarily mean we drop the max ending here, because
 * it might be multiplied with another negative number down the array.
 * For this problem, we use a similar solution to the Maximum Subarray problem but with
 * several modifications based on the above properties.
 * We need to keep track of the currentMax and currentMin cause one might turn into the other.
 */

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int currentMax = 1;
        int currentMin = 1;
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                currentMax = 1;
                currentMin = 1;
                if (maxProduct <= 0) {
                    maxProduct = 0;
                }
            } else {
                int temp = currentMax; // In case it gets overwritten
                currentMax = Math.max(Math.max(currentMax * nums[i], currentMin * nums[i]), nums[i]);
                currentMin = Math.min(Math.min(temp * nums[i], currentMin * nums[i]), nums[i]);
                maxProduct = Math.max(maxProduct, currentMax);
            }
        }
        return maxProduct;
    }
}
