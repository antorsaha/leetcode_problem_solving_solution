package solutions;

public class P0134_Gas_Station {
    class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int gasInTank = 0;
            int sum = 0;
            int start = 0;

            for (int i = 0; i < gas.length; i++) {
                gasInTank += gas[i] - cost[i];
                sum += gas[i] - cost[i];

                if (gasInTank < 0) {
                    start = i + 1;
                    gasInTank = 0;
                }
            }
            return sum >= 0 ? start : -1;

        }
    }
}
