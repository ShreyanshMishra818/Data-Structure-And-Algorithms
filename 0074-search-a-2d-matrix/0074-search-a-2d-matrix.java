class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int lo=0;
        int hi=(m*n)-1;
        int ans=-1;
        while(hi>=lo){
            int mid=lo+(hi-lo)/2;
            if(matrix[mid/m][mid%m]>=target){
                ans=matrix[mid/m][mid%m];
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
}