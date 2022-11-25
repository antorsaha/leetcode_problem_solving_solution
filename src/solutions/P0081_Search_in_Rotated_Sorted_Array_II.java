package solutions;

public class P0081_Search_in_Rotated_Sorted_Array_II {
    class Solution {
        public boolean search(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return true;
                }
                if (arr[start] < arr[mid]) {
                    if (target < arr[mid] && arr[start] <= target) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else if (arr[mid] < arr[start]) {
                    if (target <= arr[end] && arr[mid] < target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                } else {
                    start++;
                }
            }
            return false;
        }
    }
}
