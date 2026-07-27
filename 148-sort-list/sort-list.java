
class Solution {
    public ListNode sortList(ListNode head) {
    
        ListNode temp = head;
        int count =0;
        while(temp!=null){
            count ++;
            temp = temp.next;
        }
        int arr[] = new int[count];
        temp = head;
        int idx=0;
        while(temp!=null){
            arr[idx]=temp.val;
            idx ++;
            temp=temp.next;
        }
        Arrays.sort(arr);
        temp=head;
        idx =0;
        while(temp!=null){
            temp.val = arr[idx];
            idx ++;
            temp = temp.next;
        }
   return head; }
}