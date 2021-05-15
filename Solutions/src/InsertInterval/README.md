# Link

https://leetcode.com/problems/insert-interval/

## Insight

An interval problem with a few conditions. 
1. If the new interval is less than the current interval, we add it to our result.
2. If the new interval overlaps with the interval, we merge it. 
After we add the new interval, the rest of the intervals can be added behind it. 