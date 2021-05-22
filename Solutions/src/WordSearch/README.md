# Link

https://leetcode.com/problems/word-search/

## Insight

Bfs search for each cell, marking characters as visited
so we do not revisit them again as we recurse through the 
neighbouring cells. If we fail to find a successful bfs,
then we will have to unmark the current cell as visited since
it is not used to form any other sequence of valid substring. 