package solutions;

public class P0042_Trapping_Rain_Water {
    class Solution {
        public int trap(int[] height) {
            int water = 0;

            int[] left = new int[height.length];
            int[] right = new int[height.length];

            left[0] = height[0];
            right[height.length - 1] = height[height.length - 1];

            for (int i = 1; i < height.length; i++) {
                left[i] = Math.max(height[i], left[i - 1]);
            }
            for (int i = height.length - 2; i >= 0; i--)
                right[i] = Math.max(right[i + 1], height[i]);

            for (int i = 0; i < height.length; i++) {
                water += (Math.min(left[i], right[i]) - height[i]);
            }

            return water;
        }
    }
}
