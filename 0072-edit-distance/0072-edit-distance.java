class Solution {
    static int dp[][];
    public int minstep(int i , int j ,StringBuilder a, StringBuilder b,int dp[][]) {
        if(i==-1) return j+1;
        if(j==-1) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
      if(a.charAt(i)==b.charAt(j)) return dp[i][j]=minstep(i-1,j-1,a,b,dp);
      else{
        int del=minstep(i-1,j,a,b,dp);
         int ins=minstep(i,j-1,a,b,dp);
          int rep=minstep(i-1,j-1,a,b,dp);
           return dp[i][j]=1+Math.min(del,Math.min(ins,rep));

      }
       
        }
    public int minDistance(String word1, String word2) {
        
        StringBuilder a = new StringBuilder(word1);
        StringBuilder b = new StringBuilder(word2);
          int m = a.length();
        int n = b.length();
        dp= new int[m+1][n+1];
        for(int i=0;i<dp.length;i++){
            for(int j =0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
      
        return minstep(m-1,n-1,a,b,dp);
        
    }
}