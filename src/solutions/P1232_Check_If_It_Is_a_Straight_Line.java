package solutions;

public class P1232_Check_If_It_Is_a_Straight_Line {
    class Solution {
        public boolean checkStraightLine(int[][] coordinates) {
            int xMove = coordinates[1][0] - coordinates[0][0];
            int yMove = coordinates[1][1] - coordinates[0][1];

            for (int i = 1; i < coordinates.length; i++) {
                int x = coordinates[i][0] - coordinates[i - 1][0];
                int y = coordinates[i][1] - coordinates[i - 1][1];

                if (x * yMove != y * xMove) {
                    return false;
                }
            }
            return true;
        }
    }
}
