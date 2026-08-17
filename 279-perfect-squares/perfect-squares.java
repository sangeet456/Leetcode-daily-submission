import java.util.*;
class Solution {

static int perfectsquare(int num , Vector<Integer> dp){
    if(num ==0) return 0;
    if(dp.get(num) !=-1) return dp.get(num);
    int mincount=Integer.MAX_VALUE;

  for(int i=1;i*i<=num;i++){
    int result =1 + perfectsquare(num-i*i,dp);
    if(result < mincount) mincount = result;
  }
 dp.set(num,mincount) ; 
return mincount;}



    public int numSquares(int n) {
            if(n==0) return 0;
    Vector <Integer> dp = new Vector<>();
    for(int i=0;i<=n;i++){
        dp.add(i,-1);
    }
  return perfectsquare(n,dp); }
}