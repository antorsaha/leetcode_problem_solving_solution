package solutions;

public class P0390_Elimination_Game {
    class Solution {
        public int lastRemaining(int n) {
            int firstElement = 1;
            int count = n;
            int iteration = 1;
            int step = 1;

            while (count > 1) {
                if (iteration % 2 == 1 || count % 2 == 1) {
                    firstElement = firstElement + step;
                }
                count /= 2;
                step *= 2;
                iteration++;
            }
            return firstElement;
        }
    }
}
