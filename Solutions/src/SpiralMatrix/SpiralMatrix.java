package SpiralMatrix;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

/*
1. go right col + 1, until col == matrix[0].length - 1
2. go down row + 1, until row == matrix.length - 1
3. go left col - 1, until col == 0
4. go up row - 1, until row == 0

check if i have reached the end of the matrix bounds, then
if we did, change direction
if we have not, check if the next cell in current direction has already been visited,
if yes, change direction

right -> right/down
down -> down/left
left -> left/up
up -> up/right
*/

public class SpiralMatrix {
    private int RIGHT = 1;
    private int DOWN = 2;
    private int LEFT = 3;
    private int UP = 4;

    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        boolean[][] visited = new boolean[row][col];
        List<Integer> ans = new ArrayList<>();

        if (matrix.length == 1) {
            for (int i = 0; i < matrix[0].length; i++) {
                ans.add(matrix[0][i]);
            }
            return ans;
        }

        if (matrix[0].length == 1) {
            for (int i = 0; i < matrix.length; i++) {
                ans.add(matrix[i][0]);
            }
            return ans;
        }

        dfs(matrix, 0, 0, RIGHT, visited, ans);

        return ans;
    }

    private void dfs(int[][] matrix, int row, int col, int direction, boolean[][] visited, List<Integer> ans) {
        if (row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length) {
            return;
        }

        ans.add(matrix[row][col]);
        visited[row][col] = true;

        if (direction == RIGHT) {
            if (col == matrix[0].length - 1) {
                if (!visited[row + 1][col]) {
                    dfs(matrix, row + 1, col, DOWN, visited, ans);
                } else {
                    return;
                }
            } else if (!visited[row][col + 1]) {
                dfs(matrix, row, col + 1, RIGHT, visited, ans);
            } else if (visited[row][col + 1]) {
                if (!visited[row + 1][col]) {
                    dfs(matrix, row + 1, col, DOWN, visited, ans);
                } else {
                    return;
                }
            }
        }

        if (direction == DOWN) {
            if (row == matrix.length - 1) {
                if (!visited[row][col - 1]) {
                    dfs(matrix, row, col - 1, LEFT, visited, ans);
                } else {
                    return;
                }
            } else if (!visited[row + 1][col]) {
                dfs(matrix, row + 1, col, DOWN, visited, ans);
            } else if (visited[row + 1][col]) {
                if (!visited[row][col - 1]) {
                    dfs(matrix, row, col - 1, LEFT, visited, ans);
                } else {
                    return;
                }
            }
        }

        if (direction == LEFT) {
            if (col == 0) {
                if (!visited[row - 1][col]) {
                    dfs(matrix, row - 1, col, UP, visited, ans);
                } else {
                    return;
                }
            } else if (!visited[row][col - 1]) {
                dfs(matrix, row, col - 1, LEFT, visited, ans);
            } else if (visited[row][col - 1]) {
                if (!visited[row - 1][col]) {
                    dfs(matrix, row - 1, col, UP, visited, ans);
                } else {
                    return;
                }
            }
        }

        if (direction == UP) {
            if (row == 0) {
                if (!visited[row][col + 1]) {
                    dfs(matrix, row, col + 1, RIGHT, visited, ans);
                } else {
                    return;
                }
            } else if (!visited[row - 1][col]) {
                dfs(matrix, row - 1, col, UP, visited, ans);
            } else if (visited[row - 1][col]) {
                if (!visited[row][col + 1]) {
                    dfs(matrix, row, col + 1, RIGHT, visited, ans);
                } else {
                    return;
                }
            }
        }
    }
}
