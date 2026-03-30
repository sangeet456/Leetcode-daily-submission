class Solution {




    public void moveZeroes(int[] nums) {
        int nonzeroindex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                    nums[nonzeroindex] = nums[i];
                    nonzeroindex++;
            }
        }
        while(nonzeroindex<nums.length){
            nums[nonzeroindex]=0;
            nonzeroindex++;
        }
        
    }
}