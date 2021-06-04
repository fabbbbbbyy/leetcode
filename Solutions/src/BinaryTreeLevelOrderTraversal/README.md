# Link

https://leetcode.com/problems/binary-tree-level-order-traversal/

## Insight

Use BFS. An important concept to understand it that the size of the queue at any point of time
represents the number of nodes in the level. Instead of polling one by one, we poll all nodes
in the same level before continuing to the next iteration of the while loop.