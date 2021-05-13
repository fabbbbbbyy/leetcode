package MaximumProductSubarray;

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
