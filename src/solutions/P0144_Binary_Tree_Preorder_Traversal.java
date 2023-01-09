package solutions;

import java.util.ArrayList;
import java.util.List;

public class P0144_Binary_Tree_Preorder_Traversal {
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
        List<Integer> answer = new ArrayList<>();

        public List<Integer> preorderTraversal(TreeNode root) {
            traversal(root);
            return answer;
        }

        private void traversal(TreeNode root) {
            if (root == null)
                return;
            answer.add(root.val);
            traversal(root.left);
            traversal(root.right);
        }

    }
}
