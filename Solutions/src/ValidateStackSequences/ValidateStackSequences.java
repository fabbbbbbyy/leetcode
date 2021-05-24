package ValidateStackSequences;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length == 0) {
            return true;
        }

        Stack<Integer> stack = new Stack<>();

        int pushIndex = 0;
        while (pushed[pushIndex] != popped[0]) {
            stack.push(pushed[pushIndex++]);

            if (pushIndex >= pushed.length) {
                return false;
            }
        }
        stack.push(pushed[pushIndex++]);

        for (int i = 0; i < popped.length; i++) {
            if (stack.empty() || stack.peek() != popped[i]) {
                if (pushIndex >= pushed.length) {
                    return false;
                }
                while (pushed[pushIndex] != popped[i]) {
                    stack.push(pushed[pushIndex++]);

                    if (pushIndex >= pushed.length) {
                        return false;
                    }
                }
                stack.push(pushed[pushIndex++]);

                if (stack.peek() == popped[i]) {
                    stack.pop();
                } else {
                    return false;
                }

            } else {
                stack.pop();
            }
        }

        return true;
    }
}
