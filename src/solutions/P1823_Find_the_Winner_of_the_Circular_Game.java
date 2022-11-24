package solutions;

public class P1823_Find_the_Winner_of_the_Circular_Game {
    class Solution {
        static int solve(int n, int k) {

            if (n == 1)
                return 0;
            return (solve(n - 1, k) + k) % n;
        }

        public int findTheWinner(int n, int k) {
            return solve(n, k) + 1;
        }
    }
}
