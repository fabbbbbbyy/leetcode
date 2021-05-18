package MathPower;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class MathPower {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        if (n == 1) {
            return x;
        }

        if (n < 0) {
            double ans = myPow(x, n / -2);

            if (n % 2 == 0) {
                ans = ans * ans;
            }
            else {
                ans = x * ans * ans;
            }

            return 1.0 / ans;
        } else {
            double ans = myPow(x, n / 2);

            if (n % 2 == 0) {
                ans = ans * ans;
            }
            else {
                ans = x * ans * ans;
            }

            return ans;
        }
    }
}
