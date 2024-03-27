class Solution {
    public void setZeroes(int[][] matrix) {
    int matrixcopy[][]=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrixcopy[i][j]=matrix[i][j];
            }
        }
      for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix[0].length;j++){
              if(matrix[i][j]==0){
                  int k=i,l=j;
                  while( k<matrix.length){
                      matrixcopy[k][l]=0;
                      k++;
                  }
                  k=i;l=j;
                  while(k>=0){
                      matrixcopy[k][l]=0;
                      k--;
                  }
                  k=i;l=j;
                  while(l<matrix[0].length){
                      matrixcopy[k][l]=0;
                      l++;
                  }
                  k=i;l=j;
                  while(l>=0){
                      matrixcopy[k][l]=0;
                      l--;
                  }
              }
          }
      }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=matrixcopy[i][j];
            }
        }
    }
}