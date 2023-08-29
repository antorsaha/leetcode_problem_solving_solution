package solutions;

public class P2483_Minimum_Penalty_for_a_Shop {
    class Solution {
        public int bestClosingTime(String customers) {
            int score = 0;
            int maxScore = 0;
            int hour = -1;

            for (int i = 0; i < customers.length(); i++) {
                char c = customers.charAt(i);
                if (c == 'Y') {
                    score++;
                } else {
                    score--;
                }

                if (score > maxScore) {
                    maxScore = score;
                    hour = i;
                }
            }
            return hour + 1;

        }
    }
}
