package solutions;

public class P0059_Spiral_Matrix_II {
    class Solution {
        public int[][] generateMatrix(int n) {
            int[][] ans = new int[n][n];
            int c = 1;
            int top = 0;
            int right = n - 1;
            int left = 0;
            int bottom = n - 1;

            while (top < bottom && left < right) {

                for (int i = left; i < right; i++)
                    ans[top][i] = c++;
                for (int i = top; i < bottom; i++)
                    ans[i][right] = c++;
                for (int i = right; i > left; i--)
                    ans[bottom][i] = c++;
                for (int i = bottom; i > top; i--)
                    ans[i][left] = c++;
                top++;
                bottom--;
                left++;
                right--;


            }
            if (n % 2 != 0) ans[n / 2][n / 2] = c;
            return ans;
        }
    }
}
