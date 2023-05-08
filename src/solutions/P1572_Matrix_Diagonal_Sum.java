package solutions;

public class P1572_Matrix_Diagonal_Sum {

    class Solution {
        public int diagonalSum(int[][] mat) {
            int sum = 0;
            int n = mat.length;

            for (int i = 0; i < n; i++) {
                System.out.println("element" + mat[i][i]);
                sum += mat[i][i];
            }
            int j = n - 1;
            for (int i = 0; i < n; i++) {
                if (i != j) {
                    System.out.println("element" + mat[i][j]);
                    sum += mat[i][j];
                    j--;
                }
            }
            return sum;
        }
    }
}
