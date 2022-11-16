package solutions;

import utrils.ListNode;

public class P0142Linked_List_Cycle_II {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode meet = detect(head);
            ListNode start = head;

            if (meet == null)
                return null;
            while (start != meet) {
                start = start.next;
                meet = meet.next;
            }
            return start;
        }

        public ListNode detect(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast)
                    return slow;
            }
            return null;
        }
    }
}
