package solutions;

public class P0530_Minimum_Absolute_Difference_in_BST {
    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    class Solution {
        private int minDiff = Integer.MAX_VALUE;
        private Integer prevValue = null;

        public int getMinimumDifference(TreeNode root) {
            traversal(root);
            return minDiff;
        }

        private void traversal(TreeNode root) {
            if (root == null)
                return;
            traversal(root.left);

            if (prevValue != null) {
                minDiff = Math.min(minDiff, Math.abs(root.val - prevValue));
            }
            prevValue = root.val;

            traversal(root.right);
        }
    }
}
