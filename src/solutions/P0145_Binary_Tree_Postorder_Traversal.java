package solutions;

import java.util.ArrayList;
import java.util.List;

public class P0145_Binary_Tree_Postorder_Traversal {
    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        P0144_Binary_Tree_Preorder_Traversal.TreeNode left;
        P0144_Binary_Tree_Preorder_Traversal.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, P0144_Binary_Tree_Preorder_Traversal.TreeNode left, P0144_Binary_Tree_Preorder_Traversal.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        List<Integer> answer = new ArrayList<>();

        public List<Integer> postorderTraversal(TreeNode root) {
            traversal(root);
            return answer;
        }

        private void traversal(TreeNode root) {
            if (root == null)
                return;

            traversal(root.left);
            traversal(root.right);
            answer.add(root.val);
        }
    }
}
