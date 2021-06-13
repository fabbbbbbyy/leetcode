# Link

https://leetcode.com/problems/search-a-2d-matrix-ii/

## Insight

If we start from the top right corner of the matrix, we can treat the entire 
matrix as a BST. From there, we divide and conquer by making a decision to either
go left or right at every cell. 