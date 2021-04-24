/**
 * https://leetcode.com/problems/container-with-most-water/
 *
 * Problem:
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0).
 * Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
 * Notice that you may not slant the container.
 *
 * Insight: Greedy modification of Kadene's algorithm.
 */

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
