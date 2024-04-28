package solutions;

import java.util.HashSet;

public class P0217_Contains_Duplicate {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> previousNumbers = new HashSet<>();

            for(int num: nums){
                if(previousNumbers.contains(num))
                    return true;

                previousNumbers.add(num);


            }
            return false;
        }
    }
}
