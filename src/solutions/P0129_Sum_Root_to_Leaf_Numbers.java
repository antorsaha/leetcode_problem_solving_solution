package solutions;

public class P0129_Sum_Root_to_Leaf_Numbers {

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
        int sum = 0;

        public int sumNumbers(TreeNode root) {
            inOrder(root, 0);
            return sum;

        }

        private void inOrder(TreeNode root, int  num) {
            if(root.left==null && root.right == null){
                num = num*10 + root.val;
                sum += num;
                return;
            }

            num = num*10 + root.val;
            if(root.left!=null){
                inOrder(root.left, num);
            }
            if(root.right!=null){
                inOrder(root.right, num);
            }
        }
    }
}
