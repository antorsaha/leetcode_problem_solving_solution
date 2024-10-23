package solutions;

public class P0114_Flatten_Binary_Tree_to_Linked_List {
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
        TreeNode resultRoot = null;

        public void flatten(TreeNode root) {
            root = flat(root);
        }

        private TreeNode flat(TreeNode root) {
            if (root == null) return null;

            TreeNode cur = root;
            TreeNode left = cur.left;
            TreeNode right = cur.right;

            cur.left = null;
            cur.right = flat(left);
            while (cur.right != null) {
                cur = cur.right;
            }
            cur.right = flat(right);
            return root;
        }
    }
}
