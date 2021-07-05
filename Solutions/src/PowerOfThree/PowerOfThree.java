package PowerOfThree;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        double nextNumber = n / 3.0;
        boolean isWhole = nextNumber % 1 == 0;

        if (!isWhole) {
            return false;
        } else {
            return isPowerOfThree(n / 3);
        }
    }
}
