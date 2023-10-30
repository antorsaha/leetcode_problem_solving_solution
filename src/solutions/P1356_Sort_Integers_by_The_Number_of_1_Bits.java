package solutions;

import java.util.Arrays;
import java.util.Comparator;

public class P1356_Sort_Integers_by_The_Number_of_1_Bits {
    class Solution {
        public int[] sortByBits(int[] arr) {
            Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);

            Comparator<Integer> comparator = new BitCountComparator();

            Arrays.sort(nums, comparator);

            return Arrays.stream(nums).mapToInt(Integer::intValue).toArray();
        }
    }

    class BitCountComparator implements Comparator<Integer> {
        private int findBitCount(int num) {
            int count  = 0;

            while (num > 0) {
                count ++;
                num &= (num - 1);
            }

            return count ;
        }

        @Override
        public int compare(Integer a, Integer b) {
            int bitCountA = findBitCount(a);
            int bitCountB = findBitCount(b);

            if (bitCountA == bitCountB) {
                return a - b;
            }

            return bitCountA - bitCountB;
        }
    }
}
