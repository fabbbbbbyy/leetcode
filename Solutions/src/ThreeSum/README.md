# Link

https://leetcode.com/problems/3sum/

## Insight

Sorting will help in most cases.
 ThreeSum can be reduced to the problem of TwoSum after fixing the first number.
 TwoSum's target will be the complement of the first number.
 If the current number is positive, no TwoSum on the right hand side will add up to the complement of the number,
 so we can break here.
 There might be more than one possibility of ThreeSum.ThreeSum for a given number, so we have to converge the pointers
 regardless.