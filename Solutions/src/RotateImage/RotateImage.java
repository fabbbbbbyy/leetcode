package RotateImage;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class RotateImage {
    public void rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length == 1) {
            return;
        }

        int row = matrix.length;
        int col = matrix[0].length;
        boolean[][] visited = new boolean[row][col];

        // Tranpose
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!visited[i][j]) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                    visited[i][j] = true;
                    visited[j][i] = true;
                }
            }
        }

        // Reverse within rows
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][col - j - 1];
                matrix[i][col - j - 1] = temp;
            }
        }
    }
}
