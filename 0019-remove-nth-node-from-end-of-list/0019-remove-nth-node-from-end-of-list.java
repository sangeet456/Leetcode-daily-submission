
class Solution {
static int length(ListNode head){
    int l=0;
    ListNode temp = head;
    while(temp!=null){
        temp = temp.next;
        l++;
    }
return l;
}

    public ListNode removeNthFromEnd(ListNode head, int n) {
     
    
        ListNode del=head;
        int size = length(head);
        if(size == n) {
            return head.next;
        }
        for(int i=0;i<size-n-1;i++){
           del = del.next;
        }
        del.next = del.next.next;
return head;    }
   
}