package solutions;

public class P0167_Two_Sum_II_Input_Array_Is_Sorted {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int index1 = 0;
            int index2 = numbers.length - 1;

            while (index1 < index2) {
                if (numbers[index1] + numbers[index2] > target) {
                    index2--;
                } else if (numbers[index1] + numbers[index2] < target)
                    index1++;
                else
                    return new int[]{index1 + 1, index2 + 1};
            }
            return null;
        }
    }
}
