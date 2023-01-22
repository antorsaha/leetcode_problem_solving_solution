package solutions;

import utrils.TreeNode;

import java.util.*;

public class P0103_Binary_Tree_Zigzag_Level_Order_Traversal {
    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            if (root == null)
                return new ArrayList<>();

            List<List<Integer>> result = new ArrayList<>();
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            int level = 0;

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
                if (level % 2 == 1)
                    Collections.reverse(list);
                result.add(list);
                level++;
            }
            return result;
        }
    }
}
