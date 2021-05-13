# Link

https://leetcode.com/problems/longest-common-subsequence/

## Insight

If either is 0, return 0.
If same letter, LCS = LCS(text1 - 1, text2 - 1) + 1.
Else, LCS = Max(LCS(text1 - 1, text2), LCS(text1, text2 - 1)).