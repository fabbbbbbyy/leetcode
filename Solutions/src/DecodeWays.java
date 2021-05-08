/**
 * https://leetcode.com/problems/decode-ways/
 *
 * Problem:
 * A message containing letters from A-Z can be encoded into numbers using the following mapping:
 *
 * 'A' -> "1"
 * 'B' -> "2"
 * ...
 * 'Z' -> "26"
 * To decode an encoded message, all the digits must be grouped then mapped back into letters using the reverse
 * of the mapping above (there may be multiple ways). For example, "11106" can be mapped into:
 *
 * "AAJF" with the grouping (1 1 10 6)
 * "KJF" with the grouping (11 10 6)
 * Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6" is different from "06".
 *
 * Given a string s containing only digits, return the number of ways to decode it.
 *
 * The answer is guaranteed to fit in a 32-bit integer.
 *
 * Insight: A difficult problem with multiple cases. I had difficulty doing a top down recursion,
 * and had to settle for bottom up, accounting for the various cases which included 0s.
 */

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
