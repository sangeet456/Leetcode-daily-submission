
class Solution {

public static ListNode reverse(ListNode head){
    if(head ==null || head.next== null) return head;
    ListNode newhead = reverse(head.next);
    head.next.next = head;
    head.next = null;
return newhead;
}

    public ListNode reverseList(ListNode head) {

return reverse(head);

    }
}