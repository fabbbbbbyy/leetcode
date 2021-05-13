# Link

https://leetcode.com/problems/house-robber/

## Insight

When dp seems weird with a recursive solution, try using a bottom up approach.
 For this example, I initially tried to use a top down recursive approach with memoization of visited sets
 which quickly turned complicated and weird.
 
 Recurrence relation: rob[i] = Math.max(rob[i - 1], rob[i - 2] + currentHouse)
 1. Rob the current house and not rob the previous house.
 2. Do not rob the current house, which means we have robbed the previous house.