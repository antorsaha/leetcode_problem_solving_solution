package solutions;

public class P1011_Capacity_To_Ship_Packages_Within_D_Days {

    class Solution {
        public int shipWithinDays(int[] weights, int days) {

            int s = 0;
            int sum = 0;

            for (int i = 0; i < weights.length; i++) {
                sum += weights[i];
            }
            int e = sum;
            int ans = 0;
            int mid = s + (e - s) / 2;

            while (s <= e) {
                if (isPossibleSolution(weights, days, mid)) {
                    ans = mid;
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
                mid = s + (e - s) / 2;
            }
            return ans;
        }

        private boolean isPossibleSolution(int[] weights, int days, int mid) {
            int dayCount = 1;
            int totalWeight = 0;

            for (int weight : weights) {
                if (totalWeight + weight <= mid) {
                    totalWeight += weight;
                } else {
                    dayCount++;
                    totalWeight = weight;
                    if (dayCount > days || weight > mid)
                        return false;
                }
            }
            return true;
        }
    }
}
