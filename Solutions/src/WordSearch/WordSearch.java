package WordSearch;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if (word.length() == 0) {
            return false;
        }
        if (board == null || board.length == 0) {
            return false;
        }

        int row = board.length;
        int col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (bfs(board, i, j, 0, word, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean bfs(char[][] board, int i, int j, int pos, String word, boolean[][] visited) {
        if (pos == word.length()) {
            return true;
        }

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || word.charAt(pos) != board[i][j] || visited[i][j]) {
            return false;
        }

        visited[i][j] = true;
        boolean upResult = bfs(board, i - 1, j, pos + 1, word, visited);
        boolean downResult = bfs(board, i + 1, j, pos + 1, word, visited);
        boolean leftResult = bfs(board, i, j - 1, pos + 1, word, visited);
        boolean rightResult = bfs(board, i, j + 1, pos + 1, word, visited);

        if (upResult || downResult || leftResult || rightResult) {
            return true;
        }

        visited[i][j] = false;
        return false;
    }
}
