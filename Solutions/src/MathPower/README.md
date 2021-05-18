# Link

https://leetcode.com/problems/powx-n/

## Insight

Fast power exponentiation. 

If even, return (x ^ (n/2)) * (x ^ (n/2)) = x^n
If odd, return x * (x ^ (n/2)) * (x ^ (n/2)) = x^n

If negative, return myPow(x, - n/2)
If positive, return myPow(x, n/2)