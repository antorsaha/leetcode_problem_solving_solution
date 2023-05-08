package solutions;

public class P337_House_Robber_III {

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
        public int rob(TreeNode root) {
            return max(dfs(root));
        }

        private int[] dfs(TreeNode root) {
            if (root == null)
                return new int[]{0, 0};

            int[] leftPair = dfs(root.left);
            int[] rightPair = dfs(root.right);

            int withRoot = root.val + leftPair[1] + rightPair[1];
            int withoutRoot = max(leftPair) + max(rightPair);

            return new int[]{withRoot, withoutRoot};
        }


        private int max(int[] arr) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max)
                    max = arr[i];
            }
            return max;
        }
    }
}
