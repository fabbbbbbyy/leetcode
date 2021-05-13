# Link

https://leetcode.com/problems/house-robber-ii/

## Insight

An extension of HouseRobber.HouseRobber.
 Break HouseRobber.HouseRobber into 2 cases.
 1. Rob first house -> Cannot rob last house -> Don't include last house in dp.
 2. Don't rob first house -> Can rob last house -> Include last house in dp.
 3. Take the max of both. 