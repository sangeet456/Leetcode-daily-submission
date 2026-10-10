import java.util.Collections;
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> l = new ArrayList<>(); 
        while(temp!=null){
            l.add(temp.val);
            temp=temp.next;
        }
        Collections.reverse(l);
        temp=head;
        int idx=0;
        while(idx<l.size()){
            temp.val=l.get(idx);
            idx++;
            temp = temp.next;
        }
        return head;
    }
}