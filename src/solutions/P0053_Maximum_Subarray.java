package solutions;

public class P0053_Maximum_Subarray {
    class Solution {
        public int maxSubArray(int[] nums) {
            int maxSum = Integer.MIN_VALUE;
            int curSum = 0;

            for (int i = 0; i < nums.length; i++) {
                curSum += nums[i];
                maxSum = Math.max(maxSum, curSum);
                if (curSum < 0)
                    curSum = 0;

            }
            return maxSum;

        }
    }
}
