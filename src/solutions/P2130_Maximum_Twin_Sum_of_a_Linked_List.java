package solutions;

import java.util.Stack;

public class P2130_Maximum_Twin_Sum_of_a_Linked_List {


    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    class Solution {
        public int pairSum(ListNode head) {
            //store the first half of linked list in the stack
            Stack<Integer> half = new Stack<>();
            int max = 0;

            ListNode slow = null, fast = head;

            //find the middle node of the linked list
            while (fast != null && fast.next != null) {
                slow = slow == null ? head : slow.next;
                fast = fast.next.next;
                half.add(slow.val);
            }

            //traverse the second half of the linked list
            while (slow.next != null) {
                slow = slow.next;
                //pop the corresponding first half of the linked list value
                max = Math.max(max, half.pop() + slow.val);
            }

            return max;

        }
    }
}
