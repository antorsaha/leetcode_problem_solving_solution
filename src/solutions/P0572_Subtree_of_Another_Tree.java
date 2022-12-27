package solutions;

import java.util.ArrayList;
import java.util.List;

public class P0572_Subtree_of_Another_Tree {


    //Definition for a binary tree node.
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
        List<TreeNode> list = new ArrayList<>();
        int target;
        boolean isValid = true;

        public boolean isSubtree(TreeNode s, TreeNode t) {
            target = t.val;
            dfs(s);

            if (list.isEmpty())
                return false;

            for (int i = 0; i < list.size() - 1; i++) {
                compare(list.get(i), t);

                if (isValid) return true;

                isValid = true;
            }

            compare(list.get(list.size() - 1), t);

            return isValid;
        }

        private void compare(TreeNode s, TreeNode t) {
            if (s == null && t == null) return;

            if ((s == null && t != null) ||
                    (t == null && s != null) || (s.val != t.val)) {
                isValid = false;
                return;
            }

            compare(s.left, t.left);
            compare(s.right, t.right);
        }

        private void dfs(TreeNode root) {
            if (root == null) return;

            if (root.val == target) {
                list.add(root);
            }

            dfs(root.left);
            dfs(root.right);
        }
    }
}
