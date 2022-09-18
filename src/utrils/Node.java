package utrils;// Definition for a utrils.Node.

public class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        prev = _left;
        child = _right;
        next = _next;
    }
}
