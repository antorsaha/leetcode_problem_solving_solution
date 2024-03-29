package solutions;

import java.util.Arrays;

public class P1502_Can_Make_Arithmetic_Progression_From_Sequence {
    class Solution {
        public boolean canMakeArithmeticProgression(int[] arr) {
            Arrays.sort(arr);

            int diff = arr[1] - arr[0];
            for (int i = 2; i< arr.length; i++){
                int temp = arr[i]  - arr[i - 1];
                if (temp != diff)
                    return false;
            }
            return true;
        }
    }

    //Have to review this solution
    // https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/solutions/3602439/python-java-c-simple-solution-sorting-without-sorting/
}
