
  public class ListNode {
      int val;
      ListNode next;
     ListNode(int x) { val = x; }
  }

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode n=head;
 
        ListNode n1=l1;
        ListNode n2=l2;
        while(n1!=null && n2!=null){
            if(n1.val < n2.val){
                n.next = n1;
                n1 = n1.next;
            }else{
                n.next = n2;
            n2 = n2.next;
            }
        n=n.next;
    }
 
    if(n1!=null){
        n.next = n1;
    }
 
    if(n2!=null){
        n.next = n2;
    }
 
    return head.next;
    }
}