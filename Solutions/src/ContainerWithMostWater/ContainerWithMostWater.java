package ContainerWithMostWater;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int breadth = right - left;
            int currentArea = breadth * Math.min(height[left], height[right]);
            maxArea = Math.max(currentArea, maxArea);

            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
