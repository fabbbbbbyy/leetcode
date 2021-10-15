# Link

https://leetcode.com/problems/rotate-array/

## Insight

There are several ways to solve this problem. 

**Always remember to modulo number of rotations by length of array/list because
of cyclic properties.**

My first approach was in O(n) but it was still considered slow. 
1. Store all numbers before the newStartNumber in another structure.
2. Add newStartNumber till end to last number, then proceed to add everything else in order.

My second approach was also O(n), but this was in place. 
1. Reverse the entire array.
2. Reverse the first k elements of the array.
3. Reverse the remaining part of the array. 