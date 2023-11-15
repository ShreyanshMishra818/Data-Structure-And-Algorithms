class Solution {
    public static boolean found(int matrix[][],int row,int target){
        int lo=0;
        int hi=matrix[0].length-1;
        int ans=-1;
        while(hi>=lo){
            int mid=lo+(hi-lo)/2;
            if(matrix[row][mid]>=target){
                ans=matrix[row][mid];
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        if(ans==target){
            return true;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        while(i<matrix.length){
            if(target>=matrix[i][0] && target<=matrix[i][matrix[0].length-1]){
                if(found(matrix,i,target)){
                    return true;
                }
            }
             i++;
        }
        return false;
    }
}