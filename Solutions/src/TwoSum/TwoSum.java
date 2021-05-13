package TwoSum;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        int[] answer = new int[2];
        answer[0] = -1;
        answer[1] = -1;

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                answer[0] = i;
                answer[1] = map.get(complement);
                break;
            }
        }
        return answer;
    }
}
