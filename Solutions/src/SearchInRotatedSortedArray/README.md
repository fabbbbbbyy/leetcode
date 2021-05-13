# Link

https://leetcode.com/problems/search-in-rotated-sorted-array/

## Insight

When it is obvious that O(n) will be able to derive a solution for sorted array questions,
 they often require O(log n) instead. Think binary search/partitioning based on different properties
 of a given array.
 
 Search for sorted side. If target exists in the sorted side, execute binary search else repeat for the other side.