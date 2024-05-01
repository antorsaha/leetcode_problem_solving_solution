package solutions;

public class P0202_Happy_Number {
    class Solution {
        public boolean isHappy(int n) {
            int slow = n;
            int fast = n;

            do{
                slow = squire(slow);
                fast = squire(squire(fast));
            }while(slow != fast);

            return slow == 1;
        }

        private int squire(int n){
            int answer = 0;
            while(n > 0){
                int reminder = n % 10;

                answer += (reminder * reminder);
                n /= 10;
            }

            return answer;
        }
    }
}
