package solutions;

import java.util.ArrayList;

public class P2246_Longest_Path_With_Different_Adjacent_Characters {
    class Solution {
        int answer = 0;

        public int longestPath(int[] parent, String s) {
            int n = parent.length;
            ArrayList<Integer>[] adj = new ArrayList<>[n];

            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }
            for (int i = 1; i < n; i++) {
                adj[parent[i]].add(i);
            }
            dfs(adj, 0, s);
            return answer;
        }

        private int dfs(ArrayList<Integer>[] adj, int parent, String s) {
            int max1 = 0;
            int max2 = 0;

            for (int child : adj[parent]) {
                int res = dfs(adj, child, s);
                if (s.charAt(parent) == s.charAt(child))
                    continue;
                if (res > max1) {
                    max2 = max1;
                    max1 = res;
                } else if (res > max2)
                    max2 = res;
            }
            answer = Math.max(answer, max1 + max2 + 1);
            return max1 + 1;
        }
    }
}
