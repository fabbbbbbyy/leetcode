/**
 * Problem:
 * There is an integer array nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length)
 * such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
 * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 * Given the array nums after the rotation and an integer target, return the index of target if it is in nums,
 * or -1 if it is not in nums.
 *
 * Insight: When it is obvious that O(n) will be able to derive a solution for sorted array questions,
 * they often require O(log n) instead. Think binary search/partitioning based on different properties
 * of a given array.
 *
 * Search for sorted side. If target exists in the sorted side, execute binary search else repeat for the other side.
 */

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }

        int left = 0;
        int right = nums.length -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] >= nums[left]) {
                if (target >= nums[left] && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target >= nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
