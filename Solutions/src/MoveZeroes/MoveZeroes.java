package MoveZeroes;

/* For submission, replace classname with Solution in Leetcode.*/

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int numZeroes = 0;
        for (int num : nums) {
            if (num == 0) {
                numZeroes++;
            }
        }

        int currIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[currIdx] = nums[i];
                currIdx++;
            }
        }

        for (int i = nums.length - numZeroes; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    /*
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
    }
     */

    /*
    public void moveZeroes(int[] nums) {
        int lastNonZeroIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroIdx++] = nums[i];
            }
        }

        for (int i = lastNonZeroIdx; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
     */
}
