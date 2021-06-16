# Link

https://leetcode.com/problems/basic-calculator-ii/

## Insight

By default, the first 'operation' is addition, because we just want to 
add the first number onto the stack normally. Subsequent operations will have to be
kept in a variable to be referenced for future numbers. 

+: Push onto the stack.
-: Push the negative number onto the stack.
*: Pop the top number and multiply it with the current number before pushing
it onto the stack. 
/: Pop the top number and divide it with the current number before pushing
it onto the stack. 