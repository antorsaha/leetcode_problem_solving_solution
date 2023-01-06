package solutions;

import java.util.Arrays;

public class P1833_Maximum_Ice_Cream_Bars {
    class Solution {
        public int maxIceCream(int[] costs, int coins) {
            Arrays.sort(costs);
            int barCount = 0;
            for (int cost : costs) {
                if (cost <= coins) {
                    barCount++;
                    coins -= cost;
                }
                else
                    break;
            }
            return barCount;
        }
    }
}
