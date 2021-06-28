# Link

https://leetcode.com/problems/remove-duplicates-from-sorted-list/

## Insight

When the dummy and first node have the same value, we'll have to return the dummy node instead since it
is the node that we're maintaining the pointer to in our code. We continue moving the next pointer to 
a new node until the value is different from our current node. 