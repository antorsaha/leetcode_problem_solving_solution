package solutions;

import utrils.ListNode;

public class P0024_Swap_Nodes_in_Pairs {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null) {
                return null;
            }
            ListNode prev = head;
            ListNode current = head.next;
            if (current == null) {
                return prev;
            }
            ListNode temp = current.next;
            current.next = prev;
            prev.next = swapPairs(temp);
            return current;
        }
    }
}
