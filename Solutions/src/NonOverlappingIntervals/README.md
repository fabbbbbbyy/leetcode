# Link

https://leetcode.com/problems/non-overlapping-intervals/

## Insight

Solve this via interval scheduling's greedy approach. I had to refer to the discussion page for insights on this problem.

If the current interval's start overlaps with the previous interval's end, we remove the current interval. 
Else, we update the previous interval's end with the current interval's end. 

This greedy method works because if there is a solution B with first interval other than 1, then there is also a solution A of same size
with activity 1 as the first activity. **Let the first activity selected by B be k, then there will always exist A = {B - {k}} U {1}.**