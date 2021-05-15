# Link

https://leetcode.com/problems/merge-intervals/

## Insight

Similar to InsertInterval, but there are more edge cases to consider.
To summarise: 
1. Single interval (Base case checking)
2. Non-overlapping intervals (Merge only if they overlap)
3. An interval consumed by another interval (usually already covered)
4. Duplicate intervals (Make sure we don't add the same interval)