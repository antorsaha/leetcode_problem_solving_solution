package solutions;

import utrils.ListNode;

public class P0082_Remove_Duplicates_from_Sorted_List_II {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode tempList = new ListNode(-1);
            ListNode temp = tempList;
            ListNode fast;
            ListNode slow = head;
            while (slow != null) {
                fast = slow.next;
                if (fast != null && fast.val == slow.val) {
                    while (fast != null && fast.val == slow.val)
                        fast = fast.next;

                    slow = fast;
                } else {
                    temp.next = slow;
                    slow = slow.next;
                    temp = temp.next;
                }
            }
            temp.next = null;
            return tempList.next;
        }
    }
}
