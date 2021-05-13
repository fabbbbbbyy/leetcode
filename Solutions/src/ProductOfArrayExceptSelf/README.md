# Link

https://leetcode.com/problems/product-of-array-except-self/

## Insight

There are 3 cases.
 1. Two zeroes in input -> answer for all is 0.
 2. One zero in input -> answer for the index with value of 0 is the product of every other value in the array.
 3. No zeroes in input -> answer for each index is the product of the whole array divided by itself.