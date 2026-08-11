class Solution {
static void transpose(int [][] m){
        for(int i=0;i<m.length;i++){
        for(int j=i;j<m[0].length;j++){
          int temp = m[i][j];
          m[i][j]=m[j][i];
          m[j][i]=temp;
        }
    }
    }
static void reverse(int[][] matrix){
int row =0;
int n = matrix.length;




while(row<n){
int start =0;
int end = matrix[row].length-1;
while(start<end){
    int temp = matrix[row][start];
    matrix[row][start]= matrix[row][end];
    matrix[row][end] = temp;
    start++;
    end --;
}
row++;
}}



    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
}
