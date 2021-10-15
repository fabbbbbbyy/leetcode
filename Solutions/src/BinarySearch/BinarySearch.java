package BinarySearch;

/* For submission, replace classname with Solution in Leetcode.*/

public class BinarySearch {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            int num = nums[mid];

            if (num == target) {
                return mid;
            }

            if (num < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return -1;
    }
}
