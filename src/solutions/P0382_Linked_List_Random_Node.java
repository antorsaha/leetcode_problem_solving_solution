package solutions;

import java.util.ArrayList;
import java.util.List;

public class P0382_Linked_List_Random_Node {

    //Definition for singly-linked list.
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
        List<Integer> arr = new ArrayList<>();

        public Solution(ListNode head) {
            ListNode itr = head;
            while (itr != null){
                arr.add(itr.val);
                itr = itr.next;
            }
        }

        public int getRandom() {
            double random=Math.random()*arr.size();
            return arr.get((int)random);
        }
    }
}
