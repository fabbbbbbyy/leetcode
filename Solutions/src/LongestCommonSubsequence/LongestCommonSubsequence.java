package LongestCommonSubsequence;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        return helper(text1, text2, 0, 0, dp);
    }

    private int helper(String text1, String text2, int index1, int index2, int[][] dp) {
        if (index1 == text1.length() || index2 == text2.length()) {
            return 0;
        }

        if (dp[index1][index2] != 0) {
            return dp[index1][index2];
        }

        if (text1.charAt(index1) == text2.charAt(index2)) {
            dp[index1][index2] = helper(text1, text2, index1 + 1, index2 + 1, dp) + 1;
        } else {
            dp[index1][index2] = Math.max(helper(text1, text2, index1, index2 + 1, dp),
                    helper(text1, text2, index1 + 1, index2, dp));
        }

        return dp[index1][index2];
    }
}
