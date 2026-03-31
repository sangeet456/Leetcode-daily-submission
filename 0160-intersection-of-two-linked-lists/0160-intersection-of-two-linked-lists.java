public class Solution {
    
    static int length(ListNode head) {
        int l = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            l++;
        }
        return l;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = length(headA);
        int l2 = length(headB);
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;
        if (l1 > l2) {
            int d = l1 - l2;
            while (d > 0) {
                ptr1 = ptr1.next;
                d--;
            }
        } else if (l2 > l1) {
            int d = l2 - l1;
            while (d > 0) {
                ptr2 = ptr2.next;
                d--;
            }
        }
        

        while (ptr1 != null && ptr2 != null) {
            if (ptr1 == ptr2) {
                return ptr1;  
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        return null; 
    }
}