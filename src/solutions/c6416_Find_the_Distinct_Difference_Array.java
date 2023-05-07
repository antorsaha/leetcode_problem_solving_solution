package solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class c6416_Find_the_Distinct_Difference_Array {

    class Solution {
        public static int[] distinctDifferenceArray(int[] nums) {
            Map<Integer, Integer> prefix = new HashMap<>();
            Map<Integer, Integer> suffix = new HashMap<>();
            int[] result = new int[nums.length];

            for (int num : nums) {
                int accu = suffix.getOrDefault(num, 0);
                suffix.put(num, accu + 1);
            }

            for (int i = 0; i< nums.length; i++){
                prefix.put(nums[i], 1);
                int accu = suffix.get(nums[i]);
                System.out.println("accu " + accu);
                if (accu == 1){
                    suffix.remove(nums[i]);
                }else if (accu > 1){
                    suffix.put(nums[i], accu - 1);
                }

                System.out.println("pre " + prefix.size());
                System.out.println("suf " + suffix.size());

                result[i] = prefix.size() - suffix.size();
            }

            return result;
        }
    }


}
