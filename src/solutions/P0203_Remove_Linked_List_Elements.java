package solutions;

import utrils.ListNode;

public class P0203_Remove_Linked_List_Elements {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            while (head!=null && head.val == val) {
                head = head.next;
            }
            ListNode p = head;
            while (p != null){
                while (p.next!=null && p.next.val == val) p.next = p.next.next;
                p = p.next;
            }
            return head;
        }
    }
}
