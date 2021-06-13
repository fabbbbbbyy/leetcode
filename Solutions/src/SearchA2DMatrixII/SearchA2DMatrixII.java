package SearchA2DMatrixII;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (col >= 0 && row <= matrix.length - 1) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }

        return false;
    }
}
