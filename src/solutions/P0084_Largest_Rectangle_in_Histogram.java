package solutions;

import java.util.Stack;

public class P0084_Largest_Rectangle_in_Histogram {
    class Solution {
        public int largestRectangleArea(int[] heights) {
            int ans = 0;
            int[] ps = prevSmaller(heights);
            int[] ns = nextSmaller(heights);

            for (int i = 0; i < heights.length; i++) {
                int cur = (ns[i] - ps[i] - 1) * heights[i];
                ans = Math.max(ans, cur);
            }

            return ans;
        }

        private int[] prevSmaller(int[] arr) {
            int n = arr.length;
            int[] ps = new int[n];
            Stack<Integer> s = new Stack<>();

            for (int i = 0; i < n; i++) {
                while (!s.isEmpty() && arr[s.peek()] >= arr[i])
                    s.pop();
                if (s.isEmpty())
                    ps[i] = -1;
                else
                    ps[i] = s.peek();

                s.push(i);
            }
            return ps;
        }

        private int[] nextSmaller(int[] arr) {
            int n = arr.length;
            int[] ns = new int[n];
            Stack<Integer> s = new Stack<>();

            for (int i = n - 1; i >= 0; i--) {
                while (!s.isEmpty() && arr[s.peek()] >= arr[i])
                    s.pop();
                if (s.isEmpty())
                    ns[i] = n;
                else
                    ns[i] = s.peek();
                s.push(i);
            }
            return ns;
        }
    }
}
