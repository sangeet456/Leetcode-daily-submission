//euclid algo can be use for this also//
// gcd(a,b) --- gcd (a-b,b) if a>b //
//gcd (a,b) --------->>> gcd(a,b-a) if b>a //



class Solution {
private static int gcd(int x , int y){
       if(x==0) return y;
        if(y==0) return x; 
    int gcd = 1;
 
    for(int i=1;i<=Math.min(x,y);i++){
        if(x%i==0 && y%i==0) gcd = i;
    }
return gcd;}


    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int x = nums[nums.length-1];
        int y = nums[0];
        return gcd(x,y);
    }
}