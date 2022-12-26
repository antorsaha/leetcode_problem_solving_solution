package solutions;

import java.util.LinkedList;
import java.util.Queue;

public class P0547_Number_of_Provinces {
    class Solution {
        public int findCircleNum(int[][] isConnected) {
            int V = isConnected.length;
            int ans = 0;
            boolean[] visited = new boolean[V];
            for (int i = 0; i < V; i++) {
                if (!visited[i]) {
                    ans++;
                    BFS(isConnected, i, visited);
                }
            }
            return ans;
        }

        private void BFS(int[][] adj_mat, int sv, boolean[] visited) {

            Queue<Integer> queue = new LinkedList<>();
            queue.add(sv);
            visited[sv] = true;
            int v = adj_mat.length;
            while (!queue.isEmpty()) {
                int curr = queue.poll();
                for (int i = 0; i < v; i++) {
                    if (adj_mat[curr][i] == 1 && !visited[i]) {
                        queue.add(i);
                        visited[i] = true;
                    }

                }

            }
        }
    }
}
