package solutions;

public class P0300_Longest_Increasing_Subsequence {
    class Solution {
        public int lengthOfLIS(int[] nums) {
            int[] a = new int[nums.length];
            int k = 0;
            a[k] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < a[k]) {
                    int lb = 0, ub = k;
                    while (lb <= ub) {
                        int mid = (lb + ub) / 2;
                        if (a[mid] < nums[i])
                            lb = mid + 1;
                        else
                            ub = mid - 1;
                    }
                    a[lb] = nums[i];
                } else if (a[k] != nums[i]) {
                    k++;
                    a[k] = nums[i];
                }
            }
            return k + 1;
        }
    }
}
