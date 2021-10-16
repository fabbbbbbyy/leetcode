package TwoSumII;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.HashMap;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int[] res = new int[2];

        while (l <= r) {
            int added = numbers[l] + numbers[r];

            if (added == target) {
                res[0] = l + 1;
                res[1] = r + 1;
                break;
            }

            if (added < target) {
                l++;
            } else {
                r--;
            }
        }

        return res;
    }
}
