package BasicCalculatorII;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class BasicCalculatorII {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int currNumber = 0;
        char currOperation = '+';

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (currChar != ' ') {
                if (Character.isDigit(currChar)) {
                    currNumber = (currNumber * 10) + (currChar - '0');
                } else {
                    switch (currOperation) {
                        case '+':
                            stack.push(currNumber);
                            break;
                        case '-':
                            stack.push(currNumber * -1);
                            break;
                        case '*':
                            stack.push(stack.pop() * currNumber);
                            break;
                        case '/':
                            stack.push(stack.pop() / currNumber);
                            break;
                        default:
                            break;
                    }
                    currOperation = currChar;
                    currNumber = 0;
                }
            }
        }

        switch (currOperation) {
            case '+':
                stack.push(currNumber);
                break;
            case '-':
                stack.push(currNumber * -1);
                break;
            case '*':
                stack.push(stack.pop() * currNumber);
                break;
            case '/':
                stack.push(stack.pop() / currNumber);
                break;
            default:
                break;
        }

        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }
}
