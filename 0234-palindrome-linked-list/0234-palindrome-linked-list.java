
class Solution {
    static ListNode rev(ListNode head){
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode a = head.next;
        ListNode newhead = rev(a);
        a.next = head ;
        head.next = null;
    return newhead;}
    public boolean isPalindrome(ListNode head) {
        if(head ==null) return true;

        //create deep copy
        ListNode newhead = new ListNode(head.val);
        ListNode t1 = head.next;
        ListNode t2 = newhead;
        while(t1!=null){
            ListNode temp = new ListNode(t1.val);
            t2.next = temp;
            t2 = t2.next;
            t1 = t1.next;
        }
        newhead = rev(newhead);
        t1 = head;
        t2=newhead;
        while(t1!=null){
            if(t1.val != t2.val) return false;
            t2=t2.next;
            t1=t1.next;
        }
        return true;
    }
}