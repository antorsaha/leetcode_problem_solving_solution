package solutions;

import java.util.ArrayList;
import java.util.List;

public class C6430_Find_the_Losers_of_the_Circular_Game {
    class Solution {
        int r = 0;
        boolean[] isVisited;
        public int[] circularGameLosers(int n, int k) {
            if (n == 1)
                return new int[]{};

            isVisited = new boolean[n + 1];

            findLosers(n, k, 1);
            List<Integer> result = new ArrayList<>();

            for (int i = 1; i< isVisited.length; i++){
                if (!isVisited[i]){
                    result.add(i);
                }
            }
            int[] aa = new int[result.size()];
            for (int i = 0; i< result.size(); i++){
                aa[i] = result.get(i);
            }
            return aa;
        }

        private void findLosers(int n, int k, int position){
            position = position % n;
            if (isVisited[position]){
                return;
            }
            isVisited[position] = true;
            r++;
            findLosers(n, k, position+ (k * r));
        }
    }
}
