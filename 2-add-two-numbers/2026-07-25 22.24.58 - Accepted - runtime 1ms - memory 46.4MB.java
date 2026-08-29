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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=null;
        ListNode point=null;
        int val=0;
        int carry=0;
        while(l1!=null && l2!=null){
            val=l1.val+l2.val+carry;
            carry=0;
            if(val>9){
                int temp=val%10;
                val/=10;
                carry=val%10;
                val=temp;
            }
            ListNode li=new ListNode(val);
            if(res==null){
                res=li;
                point=res;
            }else
            if(point.next==null){
                point.next=li;
                point=point.next;
            }
            l1=l1.next;
            l2=l2.next;
        }

        while(l1!=null){
            val=l1.val+carry;
            carry=0;
            if(val>9){
                int temp=val%10;
                val/=10;
                carry=val%10;
                val=temp;
            }
            ListNode li=new ListNode(val);
            if(point.next==null){
                point.next=li;
                point=point.next;
            }
            l1=l1.next;
        }

        while(l2!=null){
            val=l2.val+carry;
            carry=0;
            if(val>9){
                int temp=val%10;
                val/=10;
                carry=val%10;
                val=temp;
            }
            ListNode li=new ListNode(val);
            if(point.next==null){
                point.next=li;
                point=point.next;
            }
            l2=l2.next;
        }

        if(carry>0){
            ListNode li= new ListNode(carry);
            if(point.next==null){
                point.next=li;
                point=point.next;
            }
        }
        return res;
    }
}