# Link

https://leetcode.com/problems/maximum-product-subarray/

## Insight

Contiguous subarrays tend to involve either the Kadene's or Sliding Window technique.
 Encountering a zero would mean restarting the contiguous section from the following element.
 Hitting a negative number does not necessarily mean we drop the max ending here, because
 it might be multiplied with another negative number down the array.
 For this problem, we use a similar solution to the Maximum Subarray problem but with
 several modifications based on the above properties.
 We need to keep track of the currentMax and currentMin cause one might turn into the other.