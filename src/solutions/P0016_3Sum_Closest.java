package solutions;

import java.util.Arrays;

public class P0016_3Sum_Closest {
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);

            int closest = 0;
            int minDiff = Integer.MAX_VALUE;
            int n = nums.length;

            for (int i = 0; i < n - 2; i++) {
                int k = n - 1;
                int j = i + 1;
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if (sum == target)
                        return target;
                    else if (sum < target)
                        j++;
                    else
                        k--;

                    int diff = Math.abs(target - sum);
                    if (diff < minDiff) {
                        minDiff = diff;
                        closest = sum;
                    }
                }
            }
            return closest;
        }
    }
}
