# Link

https://leetcode.com/problems/longest-repeating-character-replacement/

## Insight

Sliding window, keep track of the max number of repeated characters
within the window, and make sure it doesn't exceed k. Once it exceeds k, 
we move the left pointer forward.