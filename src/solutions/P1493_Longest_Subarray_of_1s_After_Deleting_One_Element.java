package solutions;

public class P1493_Longest_Subarray_of_1s_After_Deleting_One_Element {
    class Solution {
        public int longestSubarray(int[] nums) {
            int n = nums.length;

            int left = 0;
            int zeros = 0;
            int ans = 0;

            for (int right = 0; right < n; right++) {
                if (nums[right] == 0) {
                    zeros++;
                }
                while (zeros > 1) {
                    if (nums[left] == 0) {
                        zeros--;
                    }
                    left++;
                }
                ans = Math.max(ans, right - left + 1 - zeros);
            }
            return (ans == n) ? ans - 1 : ans;
        }
    }
}
