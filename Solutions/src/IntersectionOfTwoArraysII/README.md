# Link

https://leetcode.com/problems/intersection-of-two-arrays-ii/

## Insight

Several ways to solve this problem. My first solution was just to 
keep track of frequencies of both arrays. An intersection would be if both 
frequencies had the same element which I have not previously counted as a frequency. 

However, I first used 2 hashmaps. It is sufficient to keep track of frequencies of one array. 
To guarantee minimum space, we always create the frequency hashmap for the smaller size array. 

Further if both inputs are sorted, we can use a two pointer approach. If both elements are the same,
we advance them and add the element to our result. For whichever element is smaller, we advance that
pointer. 