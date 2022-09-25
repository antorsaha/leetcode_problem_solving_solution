package solutions;

import java.util.LinkedList;

public class P0116_Populating_Next_Right_Pointers_in_Each_Node {

    // Definition for a Node.
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }


    class Solution {
        public Node connect(Node root) {
            if (root == null) return root;
            LinkedList<Node> qu = new LinkedList<>();
            qu.addLast(root);
            while (qu.size() > 0) {
                int size = qu.size();
                while (size-- > 0) {
                    Node rem = qu.removeFirst();
                    if (size > 0) {
                        rem.next = qu.peekFirst();
                    }
                    if (rem.left != null) {
                        qu.addLast(rem.left);
                    }
                    if (rem.right != null) {
                        qu.addLast(rem.right);
                    }
                }
            }
            return root;
        }
    }
}
