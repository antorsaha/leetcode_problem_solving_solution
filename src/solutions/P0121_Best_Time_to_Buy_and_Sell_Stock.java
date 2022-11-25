package solutions;

public class P0121_Best_Time_to_Buy_and_Sell_Stock {
    class Solution {
        public int maxProfit(int[] prices) {
            int n = prices.length;
            int maxProfit = 0;
            int minValue = prices[0];

            for(int i = 1; i< n; i++){
                minValue = Math.min(minValue, prices[i]);
                int profit = prices[i] - minValue;
                maxProfit = Math.max(maxProfit, profit);
            }
            return maxProfit;
        }
    }
}
