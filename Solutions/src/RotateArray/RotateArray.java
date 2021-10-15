package RotateArray;

import java.util.*;

/* For submission, replace classname with Solution in Leetcode.*/

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int numRotate = k % nums.length;

        ArrayList<Integer> toBeAdded = new ArrayList<>();
        int newStart = nums.length - numRotate;
        for (int i = 0; i < newStart; i++) {
            toBeAdded.add(nums[i]);
        }

        int idx = 0;
        for (int i = newStart; i < nums.length; i++) {
            nums[idx++] = nums[i];
        }

        for (int num : toBeAdded) {
            nums[idx++] = num;
        }
    }

//    public void rotate(int[] nums, int k) {
//        int numRotate = k % nums.length;
//
//        reverse(nums, 0, nums.length - 1);
//        reverse(nums, 0, numRotate - 1);
//        reverse(nums, numRotate, nums.length - 1);
//    }
//
//    private void reverse(int[] nums, int start, int end) {
//        while (start <= end) {
//            int temp = nums[start];
//            nums[start] = nums[end];
//            nums[end] = temp;
//            start++;
//            end--;
//        }
//    }
}
