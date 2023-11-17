package solutions;

import java.util.Arrays;

public class P1877_Minimize_Maximum_Pair_Sum_in_Array {

    class Solution {
        public int minPairSum(int[] nums) {
            Arrays.sort(nums);

            int left = 0, right = nums.length - 1;

            int minMaxPairSum = Integer.MIN_VALUE;

            while (left < right) {
                int currentPairSum = nums[left] + nums[right];

                minMaxPairSum = Math.max(minMaxPairSum, currentPairSum);

                left++;
                right--;
            }

            return minMaxPairSum;
        }
    }
}
