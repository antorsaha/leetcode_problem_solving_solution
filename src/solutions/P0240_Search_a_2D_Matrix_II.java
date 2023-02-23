package solutions;

public class P0240_Search_a_2D_Matrix_II {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length; // Number Of Rows
            int n = matrix[0].length; // Number Of Columns

            int row_idx = 0;
            int col_idx = n - 1;

            while (row_idx < m && col_idx >= 0) {
                int num = matrix[row_idx][col_idx];

                if (num == target) {
                    return true;
                } else if (num > target) {
                    col_idx--; // skip the column.
                } else {
                    row_idx++; // skip the row.
                }
            }
            return false;
        }
    }
}
