package solutions;

public class P0075_Sort_Colors {
    class Solution {
        public void sortColors(int[] nums) {
            int low = 0;
            int mid = 0;
            int high = nums.length - 1;

            while (mid <= high) {
                if (nums[mid] == 0) {
                    swap(nums, mid, low);
                    low++;
                    mid++;
                } else if (nums[mid] == 2) {
                    swap(nums, mid, high);
                    high--;
                } else
                    mid++;
            }
        }

        private void swap(int[] nums, int i1, int i2) {
            int temp = nums[i1];
            nums[i1] = nums[i2];
            nums[i2] = temp;
        }
    }
}
