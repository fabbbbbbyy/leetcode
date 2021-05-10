/**
 * https://leetcode.com/problems/number-of-islands
 *
 * Problem:
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 *
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 *
 * Insight: Standard count islands problem with bfs/dfs from every cell, flipping cells that have been visited before.
 * An alternative could possibly be using a visited array, but that takes more space.
 */

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
