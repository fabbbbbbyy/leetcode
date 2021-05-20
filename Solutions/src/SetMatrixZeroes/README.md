# Link

https://leetcode.com/problems/set-matrix-zeroes/

## Insight

We use zeroes for the first row and first column to demarcate that the
entire row/column will have to be turned into zeroes later on. We need to however,
account for the special case that the first value in the matrix might be a 0, 
so we use 2 boolean variables to keep track of whether the first row/column will 
be turned into zeroes and do it last, else it'll ruin our earlier set flags.