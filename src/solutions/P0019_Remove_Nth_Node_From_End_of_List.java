package solutions;


public class P0019_Remove_Nth_Node_From_End_of_List {
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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            head = new ListNode(0, head);
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null) {
                fast = fast.next;
                if (n-- > 0)
                    continue;
                if (fast == null)
                    slow.next = slow.next.next;
                slow = slow.next;
            }
            return head.next;
        }
    }
}
