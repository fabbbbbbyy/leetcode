package SubsetsII;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<Integer>());
        if (nums.length == 0) {
            return answer;
        }

        Arrays.sort(nums);
        HashSet<List<Integer>> hs = new HashSet<>();
        hs.add(new ArrayList<Integer>());
        hs = helper(0, nums, hs);

        List<List<Integer>> finalAnswer = new ArrayList<>();
        for (List<Integer> set : hs) {
            finalAnswer.add(set);
        }

        return finalAnswer;
    }

    private HashSet<List<Integer>> helper(int index, int[] nums, HashSet<List<Integer>> hs) {
        if (index >= nums.length) {
            return hs;
        }

        HashSet<List<Integer>> newSets = new HashSet<>();

        for (List<Integer> set : hs) {
            List<Integer> nextSet = new ArrayList<>();
            for (int element : set) {
                nextSet.add(element);
            }
            nextSet.add(nums[index]);
            newSets.add(nextSet);
        }

        for (List<Integer> set : newSets) {
            hs.add(set);
        }

        return helper(index + 1, nums, hs);
    }
}
