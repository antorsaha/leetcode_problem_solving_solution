package solutions;

import utrils.ListNode;

public class P0002_Add_Two_Numbers {
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if (l1 == null)
                return l2;
            if (l2 == null)
                return l1;

            ListNode root = new ListNode((l1.val + l2.val) % 10);
            int carry = (l1.val + l2.val) / 10;
            ListNode currentNode = root;
            l1 = l1.next;
            l2 = l2.next;

            while (l1 != null && l2 != null) {
                currentNode.next = new ListNode((l1.val + l2.val + carry) % 10);
                carry = (l1.val + l2.val + carry) / 10;
                currentNode = currentNode.next;
                l1 = l1.next;
                l2 = l2.next;
            }
            if (l1 == null && l2 != null) {
                while (l2 != null) {
                    currentNode.next = new ListNode((l2.val + carry) % 10);
                    currentNode = currentNode.next;
                    carry = (l2.val + carry) / 10;
                    l2 = l2.next;
                }
            } else if (l1 != null) {
                while (l1 != null) {
                    currentNode.next = new ListNode((l1.val + carry) % 10);
                    currentNode = currentNode.next;
                    carry = (l1.val + carry) / 10;
                    l1 = l1.next;
                }
            }
            if (carry != 0) {
                currentNode.next = new ListNode(carry);
            }

            return root;
        }
    }
}
