package MaximalSquare;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] dp = new int[rows][cols];

        int maxSquareLength = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == '1') {
                maxSquareLength = 1;
                dp[0][i] = 1;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == '1') {
                maxSquareLength = 1;
                dp[i][0] = 1;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j - 1]), dp[i - 1][j]) + 1;
                    maxSquareLength = Math.max(maxSquareLength, dp[i][j]);
                }
            }
        }

        return maxSquareLength * maxSquareLength;
    }
}
