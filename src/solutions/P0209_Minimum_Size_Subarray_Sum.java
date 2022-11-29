package solutions;

public class P0209_Minimum_Size_Subarray_Sum {
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            if (nums == null || nums.length == 0)
                return 0;

            int start = 0, end = 0, sum = 0, min = Integer.MAX_VALUE;

            while (end < nums.length) {
                sum += nums[end++];

                while (sum >= target) {
                    min = Math.min(min, end - start);
                    sum = sum - nums[start++];
                }
            }

            if (min != Integer.MAX_VALUE)
                return min;
            else
                return 0;
        }
    }
}
