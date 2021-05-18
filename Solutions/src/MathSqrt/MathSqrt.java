package MathSqrt;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class MathSqrt {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        long left = 0;
        long right = x;

        while (left < right) {
            long mid = left + (right - left) / 2;
            if (mid * mid > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
                if (left * left > x) {
                    return (int) mid;
                }
            }
        }

        return (int) left;
    }
}
