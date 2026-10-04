
class Solution {
private static  List<Integer> addArrays(List<Integer>l1,List<Integer> l2){
    List<Integer> result = new ArrayList<>();
    int i=0;
    int j=0;
    int carry=0;
    while(i<l1.size() || j<l2.size() || carry !=0){
            int dig1=0;
            if(i<l1.size()){
                dig1= l1.get(i);
            }
            int dig2=0;
            if(j<l2.size()){
                dig2 = l2.get(j);
            }
            int sum = dig1+dig2 +carry;
            result.add(sum%10);
            carry =sum/10;
            i++;
            j++;
   }
 return result;}


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> lista = new ArrayList<>();
        List<Integer> listb = new ArrayList<>();
            List<Integer> ans =  new ArrayList<>();
        ListNode temp = l1;
        while(temp !=null){
            lista.add(temp.val);
            temp=temp.next;

        }
        temp = l2;
        while(temp!=null){
            listb.add(temp.val);
            temp = temp.next;
        }
        ans = addArrays(lista,listb);
        
        ListNode dummy = new ListNode(0);
        temp = dummy;
        int idx =0;
        while(idx < ans.size()){
            temp.next=new ListNode(ans.get(idx));
            idx++;
            temp = temp.next;
        }
     return dummy.next;   
    }
}