class Solution {
    static  ListNode merge(ListNode h1, ListNode h2){
        if(h1==null || h2 ==null){
            if(h1==null) return h2;
            else return h1;
        }
        if(h1.val <= h2.val ){
            h1.next = merge(h1.next,h2);
            return h1;
        }
        else{
            h2.next = merge(h1,h2.next);
        return h2;
    }
        
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        return merge(list1 , list2);
        
    }
}