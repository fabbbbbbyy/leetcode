package PacificAtlanticWaterFlow;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class PacificAtlanticWaterFlow {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int row = heights.length;
        int col = heights[0].length;

        List<List<Integer>> result = new ArrayList<>();
        if(heights == null || row == 0 || col == 0){
            return result;
        }

        boolean[][] canReachPacific = new boolean[row][col];
        boolean[][] canReachAtlantic = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            dfs(i, 0, heights, heights[i][0], canReachPacific);
            dfs(i, col - 1, heights, heights[i][col - 1], canReachAtlantic);
        }

        for (int i = 0; i < col; i++) {
            dfs(0, i, heights, heights[0][i], canReachPacific);
            dfs(row - 1, i, heights, heights[row - 1][i], canReachAtlantic);
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (canReachPacific[i][j] && canReachAtlantic[i][j]) {
                    List<Integer> coordinates = new ArrayList<>();
                    coordinates.add(i);
                    coordinates.add(j);
                    result.add(coordinates);
                }
            }
        }

        return result;
    }

    private void dfs(int x, int y, int[][] heights, int prevHeight, boolean[][] canReachOcean) {
        if (x < 0 || y < 0 || x > heights.length - 1 || y > heights[0].length - 1 || prevHeight > heights[x][y] || canReachOcean[x][y]) {
            return;
        }

        canReachOcean[x][y] = true;

        dfs(x, y - 1, heights, heights[x][y], canReachOcean);
        dfs(x, y + 1, heights, heights[x][y], canReachOcean);
        dfs(x - 1, y, heights, heights[x][y], canReachOcean);
        dfs(x + 1, y, heights, heights[x][y], canReachOcean);
    }
}
