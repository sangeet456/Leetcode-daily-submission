class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int [] result = new int[nums.length];
        int evenindex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                result[evenindex++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
         if(nums[i]%2 !=0) result [evenindex++]=nums[i];

        }
        
    return result;}
}