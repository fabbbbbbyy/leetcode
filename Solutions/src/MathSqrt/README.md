# Link

https://leetcode.com/problems/sqrtx/

## Insight

Think Binary Search for most Math problems!

If our half * half value is more than our number, we shift the right
pointer to half - 1. 
If our half * half value is less than our number, we shift the left 
pointer to half + 1. If at this point, left * left is greater than 
the number itself, we just return mid. 
Else, we return left at the end. 

Use long to avoid integer overflow. 

Also instead of (left + right) / 2, use left + (right - left) / 2.
