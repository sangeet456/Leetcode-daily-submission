
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<Integer> l = new ArrayList<>();
        ListNode result = new ListNode(0);
    ListNode temp = head;
    while(temp !=null){
        l.add(temp.val);
        temp = temp.next;
    }
    l.remove(l.size()-n);

    temp = result;
    int idx =0;
    
        while(idx<l.size()){
            temp.next = new ListNode(l.get(idx));
            temp=temp.next;
            idx++;
        }


        
    return result.next;}
}