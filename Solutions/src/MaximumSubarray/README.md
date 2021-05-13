# Link

https://leetcode.com/problems/maximum-subarray/

## Insight

Contiguous subarrays tend to involve either the Kadene's or Sliding Window technique.
 For this problem, we restart the contiguous section of elements if adding the current element
 gives us a smaller value than before. We do not have to worry about the global maxSum because
 it is untouched.