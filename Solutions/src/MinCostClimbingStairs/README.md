# Link

https://leetcode.com/problems/min-cost-climbing-stairs/

## Insight

I solved this problem iteratively and recursively for completeness. 

**Recursive**
1. Base case: min cost for climbing stairs when we are at the top (pos >= cost.length) is 0
2. Local choice: min cost for climbing stairs when we are not at the top is min of min cost 
of choosing to climb 1 step and choosing to climb 2 steps from our current step. 

**Iterative**
Recurrence relation: minCost(i) = min(minCost(i - 1) + cost(i - 1), minCost(i - 2) + cost(i - 2));
Minimum cost to reach the ith step is either from the step before it + its cost or 2 steps before it
+ its cost. 