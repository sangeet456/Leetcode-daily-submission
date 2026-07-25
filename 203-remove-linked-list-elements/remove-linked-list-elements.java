
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //base case //
        if(head == null) return head;
        // case 2 head remove//
       while(head !=null && head.val == val){
            head = head.next;
        }
        //case 3 rest list element remove//
            ListNode temp = head;
            while(temp !=null&&temp.next!=null){
                if(temp.next.val == val ){
                    temp.next = temp.next.next;
                }
                else {
                    temp= temp.next;
                }
            }
        
    return head;}
}