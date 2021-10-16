# Link

https://leetcode.com/problems/merge-sorted-array/

## Insight

Standard merge routine, but there is another in place solution. 

**In place solution**
1. Fill up array from the back, using the same merge routine, but the condition being
the larger value gets added first. 
2. If second array is used up, we can just return the first array. 
3. If first array is used up, we have to continue filling the rest of the array with the second array. 