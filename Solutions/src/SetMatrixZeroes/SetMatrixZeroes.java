package SetMatrixZeroes;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        boolean isFirstRowZero = false;
        boolean isFirstColZero = false;

        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                isFirstRowZero = true;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                isFirstColZero = true;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (isFirstRowZero) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }

        if (isFirstColZero) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
