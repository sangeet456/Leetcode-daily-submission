class Solution {
    public ListNode middleNode(ListNode head) {
        List<Integer> l = new ArrayList<>();
        ListNode result = new ListNode(0);
        ListNode temp = head;
        while(temp !=null){
            l.add(temp.val);
            temp = temp.next;
        }
        
        int n=l.size()/2;
        int idx =n;
        temp = result;
        while(idx<l.size()){
                temp.next=new ListNode(l.get(idx));
                idx++;
                temp=temp.next;
        }
        
   return result.next; }
}