package solutions;

public class P0074_Search_a_2D_Matrix {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            if (matrix.length == 0) return false;
            int rows = matrix.length;
            int cols = matrix[0].length;

            int left = 0;
            int right = rows * cols - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2; // calculates the mid point of 1D array.
                int midElement = matrix[mid / cols][mid % cols]; // converting midpoint of 1D array to 2D array
                if (midElement == target) return true;
                if (midElement < target) left = mid + 1;
                else right = mid - 1;
            }
            return false;
        }
    }
}
