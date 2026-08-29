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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }else if(l2==null){
            return l1;
        }
        ListNode res=null;
        ListNode temp=null;

        while(l1!=null && l2!=null){
            if(l1.val < l2.val){
                if(res==null){
                    res = new ListNode(l1.val);
                    temp = res;
                }else{
                    if(temp.next ==null){
                        temp.next = new ListNode(l1.val);
                        temp=temp.next;
                    }else{
                        if(temp.next!=null){
                            temp = temp.next;
                            temp.next = new ListNode(l1.val);
                        }
                    }

                }
                l1=l1.next;
            }else{
                if(res==null){
                    res = new ListNode(l2.val);
                    temp = res;
                }else{
                    if(temp.next ==null){
                        temp.next = new ListNode(l2.val);
                        temp=temp.next;
                    }else{
                        if(temp.next!=null){
                            temp = temp.next;
                            temp.next = new ListNode(l2.val);
                        }
                    }

                }
                l2=l2.next;
            }

        }


        while(l1!=null){
            if(temp.next==null){
                temp.next = new ListNode(l1.val);
                temp=temp.next;
            }
            l1=l1.next;
        }

        while(l2!=null){
            if(temp.next==null){
                temp.next = new ListNode(l2.val);
                temp=temp.next;
            }
            l2=l2.next;
        }
        return res;
        
    }
}