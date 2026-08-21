class Solution {
    public int[][] construct2DArray(int[] org, int m, int n) {
        int [][] result = new int[m][n];
       if(m*n != org.length) return new int[0][0];
        int idx =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[i][j] = org[idx++];
             
            }
        }
   
return result;
    }
}