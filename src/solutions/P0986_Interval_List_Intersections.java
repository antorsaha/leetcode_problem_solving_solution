package solutions;

import java.util.ArrayList;
import java.util.List;

public class P0986_Interval_List_Intersections {
    class Solution {
        public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
            if (firstList.length == 0 || secondList.length == 0)
                return new int[0][0];
            int firstIndex = 0;
            int secondIndex = 0;
            int start = 0;
            int end = 0;
            List<int[]> result = new ArrayList<>();

            while (firstIndex < firstList.length && secondIndex < secondList.length) {
                start = Math.max(firstList[firstIndex][0], secondList[secondIndex][0]);
                end = Math.min(firstList[firstIndex][1], secondList[secondIndex][1]);

                if (end >= start)
                    result.add(new int[]{start, end});

                if (end == firstList[firstIndex][1]) firstIndex++;
                if (end == secondList[secondIndex][1]) secondIndex++;
            }
            return result.toArray(new int[result.size()][2]);
        }
    }
}
