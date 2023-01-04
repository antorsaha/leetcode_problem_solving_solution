package solutions;

import java.util.LinkedList;
import java.util.Queue;

public class P0130_Surrounded_Regions {
    class Solution {
        private static final int[][] DIRS = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
        private static final char NON_CAPTURED = '#';

        public void solve(char[][] board) {
            if (board == null) {
                throw new IllegalArgumentException("Input board is null");
            }
            if (board.length == 0 || board[0].length == 0) {
                return;
            }
            int m = board.length;
            int n = board[0].length;

            for (int i = 0; i < m; i++) {
                if (board[i][0] == 'O') {
                    bfsHelper(board, i, 0);
                }

                if (board[i][n - 1] == 'O') {
                    bfsHelper(board, i, n - 1);
                }
            }
            for (int j = 1; j < n - 1; j++) {
                if (board[0][j] == 'O') {
                    bfsHelper(board, 0, j);
                }
                if (board[m - 1][j] == 'O') {
                    bfsHelper(board, m - 1, j);
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    board[i][j] = (board[i][j] == NON_CAPTURED) ? 'O' : 'X';
                }
            }
        }

        private void bfsHelper(char[][] board, int i, int j) {
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{i, j});
            board[i][j] = NON_CAPTURED;

            while (!queue.isEmpty()) {
                int[] cur = queue.poll();
                for (int[] d : DIRS) {
                    int x = cur[0] + d[0];
                    int y = cur[1] + d[1];
                    if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || board[x][y] != 'O') {
                        continue;
                    }
                    queue.offer(new int[]{x, y});
                    board[x][y] = NON_CAPTURED;
                }

            }
        }
    }
}
