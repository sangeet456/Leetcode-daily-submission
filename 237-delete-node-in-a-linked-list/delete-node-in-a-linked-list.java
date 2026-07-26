
class Solution {
    public void deleteNode(ListNode node) {
        //case 1 head node delete 
       node.val = node.next.val;
       node.next = node.next.next;
        
    }
}