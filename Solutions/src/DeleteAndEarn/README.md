# Link

https://leetcode.com/problems/delete-and-earn/

## Insight

A problem which can be reduced to House Robber I. 
Initialize a dp array with values of robbing each number. 
MaxScore(i) = Max(MaxScore(i) + MaxScore(i - 2), MaxScore(i - 1));
I can choose to rob my current, which means I cannot rob my previous. 
Or I can choose to rob my previous and not rob my current. I take the larger value
and continue building up my dp array. 