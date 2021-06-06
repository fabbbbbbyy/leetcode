# Link

https://leetcode.com/problems/maximum-width-ramp/

## Insight

Sort the array based on values, then it is guaranteed that earlier elements will be 
<= later elements in the array (nums[i] <= nums[j]). To find the max width, we 
greedily get maintain the smallest index and compare it against the preceding tuples. 