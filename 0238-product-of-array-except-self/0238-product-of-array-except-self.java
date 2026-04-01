class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] suffix = new int[n];
        int [] prefix = new int[n];
        int [] ans = new int[n];
        prefix[0]=1;
        for(int i =1;i<nums.length;i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        suffix[nums.length - 1] =1;
for(int j = nums.length-2 ; j>=0;j--){
    suffix[j] = suffix[j+1]*nums[j+1];
}
for(int i=0;i<nums.length;i++){
ans[i] = suffix[i] * prefix[i];
}
        
 return ans;   }
}