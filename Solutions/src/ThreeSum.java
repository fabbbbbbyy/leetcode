/**
 * https://leetcode.com/problems/3sum/
 *
 * Problem:
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
 * and nums[i] + nums[j] + nums[k] == 0.
 * Notice that the solution set must not contain duplicate triplets.
 *
 * Insight: Sorting will help in most cases.
 * ThreeSum can be reduced to the problem of TwoSum after fixing the first number.
 * TwoSum's target will be the complement of the first number.
 * If the current number is positive, no TwoSum on the right hand side will add up to the complement of the number,
 * so we can break here.
 * There might be more than one possibility of ThreeSum for a given number, so we have to converge the pointers
 * regardless.
 */

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int currNum = nums[i];
            if (currNum > 0) {
                break;
            }

            int complement = currNum * -1;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int twoSum = nums[left] + nums[right];
                if (twoSum == complement) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(currNum);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    set.add(triplet);
                    left += 1;
                    right -= 1;
                } else if (twoSum < complement) {
                    left += 1;
                } else {
                    right -= 1;
                }
            }
        }

        List<List<Integer>> triplets = new ArrayList<>();
        for (List<Integer> triplet : set) {
            triplets.add(triplet);
        }

        return triplets;
    }
}
