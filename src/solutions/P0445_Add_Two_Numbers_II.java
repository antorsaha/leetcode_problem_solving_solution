package solutions;

public class P0445_Add_Two_Numbers_II {

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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            l1=reverse(l1);
            l2=reverse(l2);
            ListNode r3=new ListNode(), p3=r3;
            int sum, x,y, carry=0;

            while(l1!=null||l2!=null)
            {
                x=l1!=null?l1.val:0;
                y=l2!=null?l2.val:0;
                sum=x+y+carry;
                carry=sum/10;
                sum=sum%10;
                p3.next= new ListNode(sum);
                if(l1!=null) l1=l1.next;
                if(l2!=null) l2=l2.next;
                p3=p3.next;
            }
            if(carry>0) p3.next=new ListNode(carry);
            return reverse(r3.next);
        }

        private ListNode reverse(ListNode head)
        {
            ListNode prev=null, curr=head;
            while(curr!=null)
            {
                ListNode curnxt=curr.next;
                curr.next=prev;
                prev=curr;
                curr=curnxt;
            }
            return prev;
        }
    }
}
