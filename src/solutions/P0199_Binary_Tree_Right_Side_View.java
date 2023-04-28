package solutions;

import java.util.ArrayList;
import java.util.List;

public class P0199_Binary_Tree_Right_Side_View {


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
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            right(root, result, 0);
            return result;
        }

        private void right(TreeNode root, List<Integer> list, int depth) {
            if (root == null) {
                return;
            }

            if (list.size() == depth) {
                list.add(root.val);
            }

            right(root.right, list, depth + 1);
            right(root.left, list, depth + 1);
        }
    }
}
