package solutions;

import java.util.Arrays;

public class P1351_Count_Negative_Numbers_in_a_Sorted_Matrix {

    // This solution using binary search
    class Solution {
        public int binarySearch(int[] nums) {
            int l = 0; //array starting index
            int r = nums.length; // array length
            int mid; //mid index
            while (l < r) {

                mid = (l + r) / 2;
                if (nums[r - 1] < 0) {
                    return r;
                }
                if (nums[mid] < 0 && nums[mid + 1] > 0) {
                    return mid + 1;
                }
                if (nums[mid] < 0) {
                    l = mid + 1;
                } else {
                    r = mid;
                }

            }
            return 0;
        }

        public int countNegatives(int[][] grid) {
            int count = 0;

            for (int[] arr : grid) {
                Arrays.sort(arr);
                count = count + binarySearch(arr);
            }

            return count;

        }
    }


    //Another solution and it is more optimized
    class Solution1 {
        public int countNegatives(int[][] grid) {
            int rows = grid.length;
            int cols = grid[0].length;
            int count = 0;
            int row = rows - 1;
            int col = 0;

            while (row >= 0 && col < cols) {
                if (grid[row][col] < 0) {
                    count += cols - col;
                    row--;
                } else {
                    col++;
                }
            }

            return count;
        }
    }

}
