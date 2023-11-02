package solutions;

public class P2265_Count_Nodes_Equal_to_Average_of_Subtree {

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
        private int matchingSubtreeCount = 0;
        public int averageOfSubtree(TreeNode root) {
            calculateSubtreeValues(root);
            return matchingSubtreeCount;
        }

        private int[] calculateSubtreeValues(TreeNode currentNode) {
            if (currentNode == null)
                return new int[]{0, 0};

            int[] leftSubtree = calculateSubtreeValues(currentNode.left);
            int[] rightSubtree = calculateSubtreeValues(currentNode.right);

            int sumOfValues = leftSubtree[0] + rightSubtree[0] + currentNode.val;
            int numberOfNodes = leftSubtree[1] + rightSubtree[1] + 1;

            if (sumOfValues / numberOfNodes == currentNode.val)
                matchingSubtreeCount++;

            return new int[]{sumOfValues, numberOfNodes};
        }
    }
}
