package Subsets;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<Integer>());
        if (nums.length == 0) {
            return answer;
        }

        return helper(0, nums, answer);
    }

    private List<List<Integer>> helper(int index, int[] nums, List<List<Integer>> answer) {
        if (index >= nums.length) {
            return answer;
        }

        List<List<Integer>> newSets = new ArrayList<>();

        for (List<Integer> set : answer) {
            List<Integer> nextSet = new ArrayList<>();
            for (int element : set) {
                nextSet.add(element);
            }
            nextSet.add(nums[index]);
            newSets.add(nextSet);
        }

        for (List<Integer> set : newSets) {
            answer.add(set);
        }

        return helper(index + 1, nums, answer);
    }
}
