package solutions;

import utrils.ListNode;

public class P0025_Reverse_Nodes_in_k_Group {
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
        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode f=head,l=head;
            int c=k;

            while(l!=null && --c > 0) l=l.next;
            if(c!=0) return f;
            else {
                ListNode tem = l.next;
                l.next=null;
                ListNode rev = reverse(null,f);
                ListNode ans = rev;
                while(rev.next!=null)
                    rev=rev.next;
                rev.next=reverseKGroup(tem,k);
                return ans;
            }
        }

        ListNode reverse(ListNode prev,ListNode cur){
            if(cur==null) return prev;
            ListNode tem = cur.next;
            cur.next=prev;
            return reverse(cur,tem);
        }
    }
}
