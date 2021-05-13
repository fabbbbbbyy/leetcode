# Link

https://leetcode.com/problems/coin-change/

## Insight

Sorting input might help to maintain invariants, even for DP problems.
 When using Integer.MAX_VALUE as a flag and addition is possibly needed, remember to use 1L instead of 1
 before comparison in case of integer overflow.