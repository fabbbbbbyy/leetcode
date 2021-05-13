package UniquePaths;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return helper(m, n, 0, 0, dp);
    }

    private int helper(int m, int n, int row, int col, int[][] dp) {
        if (row == m - 1) {
            return 1;
        }
        if (col == n - 1) {
            return 1;
        }

        if (dp[row][col] != 0) {
            return dp[row][col];
        }

        dp[row][col] = helper(m, n, row + 1, col, dp) + helper(m, n, row, col + 1, dp);
        return dp[row][col];
    }
}
