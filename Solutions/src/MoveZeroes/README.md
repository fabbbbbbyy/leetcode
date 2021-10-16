# Link

https://leetcode.com/problems/move-zeroes/

## Insight

My first solution was pretty slow for the problem though passable. 
We do not care about ordering of the zeroes (they are the same).
1. Count number of zeroes. 
2. Shift non-zeros to the front while keeping track of current index.
3. Add number of zeroes to the back. 

My second solution was even slower because of an inner for loop.
1. Iterate through the array.
2. For a 0, swap it with the next non zero value.

My last solution was a modification of my original solution. 
Instead of counting the number of zeroes, I maintain a pointer to the
index of where the next non zero element should go. 
1. Swap non zero elements to the non zero element index, and increment it. 
2. Fill up remainder of array from non zero element index onwards with 0s. 