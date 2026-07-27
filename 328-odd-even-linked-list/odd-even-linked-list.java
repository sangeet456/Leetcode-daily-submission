
class Solution {
    public ListNode oddEvenList(ListNode head) {
          if(head ==null || head.next == null){
            return head ;
        }        

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenhead = even ;
      
        while(even != null && even.next !=null){
            //maintaining odd list
            odd.next = even.next;
            odd = odd.next;
            //maintaining even list
            even.next = odd.next;
            even = even.next;

        }
        odd.next=evenhead;
    return head;}
}