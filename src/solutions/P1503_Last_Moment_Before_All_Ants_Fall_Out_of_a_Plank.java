package solutions;

public class P1503_Last_Moment_Before_All_Ants_Fall_Out_of_a_Plank {
    class Solution {
        public int getLastMoment(int n, int[] left, int[] right) {
            int time = 0;

            for (int pos : left) {
                time = Math.max(time, pos);
            }
            for (int pos : right) {
                time = Math.max(time, n - pos);
            }
            return time;
        }

    }
}
