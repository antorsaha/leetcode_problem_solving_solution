package solutions;

public class P0528_Random_Pick_with_Weight {
    class Solution {

        private final int[] idx;

        public Solution(int[] w) {
            for (int i = 1; i < w.length; i++)
                w[i] += w[i - 1];
            double sum = w[w.length - 1];
            double[] dw = new double[w.length];
            for (int i = 0; i < w.length; i++)
                dw[i] = w[i] * 1000 / sum;
            idx = new int[1000];
            int k = 0;
            for (int i = 0; i < w.length; i++)
                while (k < dw[i])
                    idx[k++] = i;
        }

        public int pickIndex() {
            return idx[(int) (Math.random() * 1000)];
        }
    }
}
