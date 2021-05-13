package DecodeWays;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class DecodeWays {
    public int numDecodings(String s) {
        if (s.length() == 0) {
            return 1;
        }
        if (s.length() == 1) {
            if (s.charAt(0) == '0') {
                return 0;
            } else {
                return 1;
            }
        }

        int[] dp = new int[s.length()];

        if (s.charAt(0) == '0') {
            return 0;
        } else {
            dp[0] = 1;
        }
        if (s.charAt(1) == '0') {
            if(s.charAt(0) == '1' || s.charAt(0) == '2') {
                dp[1] = 1;
            } else {
                dp[1] = 0;
            }
        } else if (Integer.valueOf(s.substring(0, 2)) > 26) {
            dp[1] = 1;
        } else {
            dp[1] = 2;
        }

        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                dp[i] += dp[i-1];
            }
            int twoDigitValue = Integer.valueOf(s.substring(i - 1, i + 1));
            if (twoDigitValue <= 26 && twoDigitValue >= 10) {
                dp[i] += dp[i-2];
            }
        }
        return dp[s.length() - 1];
    }
}
