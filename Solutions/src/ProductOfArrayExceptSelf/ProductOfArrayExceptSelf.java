package ProductOfArrayExceptSelf;

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
