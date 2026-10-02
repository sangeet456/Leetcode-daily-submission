class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row =0;
        int n = image.length;
    while(row < n){
        int start = 0;
        int end = image.length-1;
        while(start < end){
            int temp = image[row][start];
            image[row][start] = image[row][end];
            image[row][end] = temp;
            start ++;
            end --;
        }
        row ++;

    }

    for(int i=0;i<image.length;i++){
        for(int j=0;j<image[0].length;j++){
            if(image[i][j]==1) image[i][j]=0;
            else{
                image[i][j]=1;
            }
        }
    }




    return image;
    }
}