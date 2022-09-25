package solutions;

import java.util.ArrayList;
import java.util.List;

public class P0057_Insert_Interval {
    class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            int n = intervals.length;
            List<int[]> res = new ArrayList();

            for(int i = 0 ; i < n; i++) {
                int[] cur = intervals[i];
                if(newInterval == null || cur[1] < newInterval[0]) {
                    res.add(cur);
                } else if(newInterval[1] < cur[0]) {
                    res.add(newInterval);
                    res.add(cur);
                    newInterval = null;
                } else {
                    newInterval[0] = Math.min(cur[0], newInterval[0]);
                    newInterval[1] = Math.max(cur[1], newInterval[1]);
                }
            }
            if(newInterval != null) {
                res.add(newInterval);
            }
            return res.toArray(new int[0][0]);
        }
    }
}
