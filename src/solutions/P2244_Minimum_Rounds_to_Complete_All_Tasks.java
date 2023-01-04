package solutions;

import java.util.HashMap;

public class P2244_Minimum_Rounds_to_Complete_All_Tasks {
    class Solution {
        public int minimumRounds(int[] tasks) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int task : tasks)
                map.put(task, map.getOrDefault(task, 0) + 1);

            int round = 0;
            for (int val : map.values()) {
                if (val == 1)
                    return -1;
                if (val % 3 == 0)
                    round += val / 3;
                else if (val % 3 == 1)
                    round += (val - 4) / 3 + 2;
                else
                    round += (val - 2) / 3 + 1;
            }
            return round;
        }
    }
}
