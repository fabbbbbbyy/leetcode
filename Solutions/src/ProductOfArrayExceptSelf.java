/**
 * Problem:
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of
 * all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * Insight: There are 3 cases.
 * 1. Two zeroes in input -> answer for all is 0.
 * 2. One zero in input -> answer for the index with value of 0 is the product of every other value in the array.
 * 3. No zeroes in input -> answer for each index is the product of the whole array divided by itself.
 */

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        HashSet<Integer> zeroIndices = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroIndices.add(i);
            }
        }

        int[] answer = new int[nums.length];
        if (zeroIndices.size() >= 2) {
            return answer;
        } else if (zeroIndices.size() == 1) {
            int product = 1;
            int zeroIndex = 0;
            for (int i = 0; i < nums.length; i++) {
                if (!zeroIndices.contains(i)) {
                    product *= nums[i];
                } else {
                    zeroIndex = i;
                }
            }
            answer[zeroIndex] = product;
            return answer;
        } else {
            int product = 1;
            for (int i = 0; i < nums.length; i++) {
                product *= nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                answer[i] = product / nums[i];
            }
            return answer;
        }
    }
}
