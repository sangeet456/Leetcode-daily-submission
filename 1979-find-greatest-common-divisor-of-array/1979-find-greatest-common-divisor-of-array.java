class Solution {

private static int gcd (int x , int y){
    int gcd =1;
    for(int i=1;i<=Math.min(x,y);i++){
       if(x%i==0 && y%i==0){
        gcd =i;
       }
        
    }
return gcd;}

    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[nums.length-1];

        return gcd(a,b);
        
    }
}