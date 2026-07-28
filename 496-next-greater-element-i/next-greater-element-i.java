class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
  // Early exit optimization
        if (nums1.length == 0) return new int[0];
        if (nums1.length == 1 && nums2.length == 1) return new int[]{-1};



        HashMap<Integer,Integer> mp = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        

        for(int i=nums2.length-1;i>=0;i--){
            while(st.size()!=0 && st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.size()==0){
                mp.put(nums2[i],-1);

            }
            else{
                mp.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }
        int result[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i] = mp.get(nums1[i]);
        }
return result;
    }
}