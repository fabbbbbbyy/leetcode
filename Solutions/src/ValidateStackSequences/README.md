# Link

https://leetcode.com/problems/validate-stack-sequences/

## Insight

Push till the first element of pop and make sure that ordering is maintained.
If the element on the stack is not the same as the element to be popped,
either the popped element has not been pushed, or the stack is invalid.