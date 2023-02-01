package solutions;

import utrils.TreeNode;

public class P0112_Path_Sum {
    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null)
                return false;
            if (root.left == null && root.right == null && targetSum - root.val == 0)
                return true;
            else
                return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);

        }
    }
}
