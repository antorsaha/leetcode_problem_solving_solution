package solutions;

import utrils.TreeNode;

import java.util.*;

public class P107_Binary_Tree_Level_Order_Traversal_II {
    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            if (root == null)
                return new ArrayList<>();

            List<List<Integer>> result = new ArrayList<>();
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);

            while (!q.isEmpty()) {
                int n = q.size();
                List<Integer> list = new ArrayList<>();

                for (int i = 0; i < n; i++) {
                    TreeNode curr = q.poll();

                    if (curr != null) {
                        list.add(curr.val);
                        if (curr.left != null)
                            q.offer(curr.left);
                        if (curr.right != null)
                            q.offer(curr.right);
                    }
                }
                result.add(list);
            }
            Collections.reverse(result);
            return result;
        }
    }
}
