# Link

https://leetcode.com/problems/longest-substring-without-repeating-characters/

## Insight

If the current character has not been included before, 
include it. Otherwise, remove the first character of the 
current substring until we can include the current character.