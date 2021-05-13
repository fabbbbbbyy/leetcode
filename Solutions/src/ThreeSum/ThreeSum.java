package ThreeSum;

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
                    left++;
                    right--;
                } else if (twoSum < complement) {
                    left++;
                } else {
                    right--;
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
