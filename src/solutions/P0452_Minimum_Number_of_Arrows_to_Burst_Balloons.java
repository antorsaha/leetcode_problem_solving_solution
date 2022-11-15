package solutions;

import java.util.Arrays;
import java.util.Comparator;

public class P0452_Minimum_Number_of_Arrows_to_Burst_Balloons {
    class Solution {
        public int findMinArrowShots(int[][] points) {
            Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
            int ans = 0, arrow = 0;
            for (int i = 0; i < points.length; i++) {
                if (ans == 0 || points[i][0] > arrow) {
                    ans++;
                    arrow = points[i][1];
                }
            }
            return ans;
        }
    }
}
