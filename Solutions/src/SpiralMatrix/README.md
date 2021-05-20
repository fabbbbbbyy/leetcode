# Link

https://leetcode.com/problems/spiral-matrix/

## Insight

A hardcoded kind of matrix problem. Follow problem specifications while
adhering to edge cases like matrices of length 1 for either row/column.

There are 2 states for every direction:
1. Right -> Right/Down
2. Down -> Down/Left
3. Left -> Left/Up
4. Up -> Up/Right

If we reach the bounds of the matrix, we check if we can change directions, 
else we return. 
If we have not visited the next cell in the same direction, we recurse on it.
If we have visited the next cell in the same direction, we check if we can change 
directions, else we return. 