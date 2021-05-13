package CountIslands;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class CountIslands {
    public int numIslands(char[][] grid) {
        int answer = 0;
        int row = grid.length;
        int col = grid[0].length;

        boolean[][] visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    dfs(i, j, grid);
                    answer++;
                }
            }
        }

        return answer;
    }

    private void dfs(int x, int y, char[][] grid) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == '0') {
            return;
        }

        grid[x][y] = '0';
        dfs(x, y - 1, grid);
        dfs(x, y + 1, grid);
        dfs(x - 1, y, grid);
        dfs(x + 1, y, grid);
    }
}
