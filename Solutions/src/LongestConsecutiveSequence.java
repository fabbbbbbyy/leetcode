/**
 * https://leetcode.com/problems/longest-consecutive-sequence/
 *
 * Problem:
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 *
 * Insight: Standard sliding window, remember to account for duplicates.
 */

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int maxConsecutive = 1;
        int currentConsecutive = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] - 1 == nums[i - 1]) {
                currentConsecutive += 1;
                maxConsecutive = Math.max(currentConsecutive, maxConsecutive);
            } else {
                currentConsecutive = 1;
            }
        }

        return maxConsecutive;
    }
}
