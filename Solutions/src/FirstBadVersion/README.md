# Link

https://leetcode.com/problems/first-bad-version/

## Insight

A very interesting question involving the use of binary search. 

My initial solution was:
1. If mid is bad, check if the element to the left of mid is good -> Mid is first bad.
2. If mid is good, check if the element to the right of mid is bad -> Right element of mid is first bad.

Revised solution (wishful thinking):
1. If mid is bad, everything to the right of mid is bad. Check left.
2. If mid is good, everything to the left of mid is good. Check right. 
3. Eventually, the pointers will converge such that left pointer will be the value of the first bad.

This is similar to SearchInsertPosition, where we rely on the left pointer of the binary
search algorithm to find the correct insert position. 