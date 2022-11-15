package solutions;

import utrils.ListNode;

/**
 * Problem
 * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 */

public class P0234_Palindrome_Linked_List {
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
        public boolean isPalindrome(ListNode head) {
            ListNode slw = head;
            ListNode fast = head;

            while (fast.next != null) {
                slw = slw.next;
                fast = fast.next.next;
            }

            ListNode secondHead = reverseList(slw);
            while (head != null && secondHead != null) {
                if (head.val != secondHead.val) {
                    return false;
                }
                head = head.next;
                secondHead = secondHead.next;
            }
            return true;

        }
        public ListNode reverseList(ListNode node) {
            ListNode prev = null;
            ListNode current = node;
            ListNode next = current.next;

            while (current != null) {
                current.next = prev;
                prev = current;
                current = next;

                if (next != null) {
                    next = next.next;
                }
            }

            return prev;
        }
    }
}
