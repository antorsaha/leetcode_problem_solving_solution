package solutions;

public class P944_Delete_Columns_to_Make_Sorted {
    class Solution {
        public int minDeletionSize(String[] strs) {
            if (strs == null || strs.length == 0)
                return 0;
            int result = 0;
            int numCol = strs[0].length();

            for (int i = 0; i < numCol; i++) {
                int j = 0;
                for (; j < strs.length - 1; j++) {
                    if (strs[j].charAt(i) > strs[j + 1].charAt(i))
                        break;
                }
                if (j != strs.length - 1)
                    result++;
            }
            return result;
        }
    }
}
