package solutions;

public class P0117_Populating_Next_Right_Pointers_in_Each_Node_II {
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

    public class Solution {
        public Node connect(Node root) {
            if (root == null) return null;
            Node current = root;

            if (current.left != null) {
                current.left.next = current.right != null ? current.right : getNext(current);
            }
            if (current.right != null && current.next != null) {
                current.right.next = current.next.left != null ? current.next.left : getNext(current);
            }
            connect(root.right);
            connect(root.left);

            return root;
        }

        private Node getNext(Node root) {
            Node temp = root.next;
            while (temp != null) {
                if (temp.left != null) return temp.left;
                if (temp.right != null) return temp.right;

                temp = temp.next;
            }
            return null;
        }
    }
}
