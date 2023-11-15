class Solution {
    public static int findMax(int mat[][],int row){
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<mat[0].length;i++){
            if(mat[row][i]>max){
                max=mat[row][i];
                index=i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        int lo=0;
        int hi=mat.length-1;
        while(hi>=lo){
            int mid=lo+(hi-lo)/2;
            int maxElement=findMax(mat,mid);
            int top=mid-1>=0?mat[mid-1][maxElement]:-1;
            int bottom=mid+1<=hi?mat[mid+1][maxElement]:-1;
            if(mat[mid][maxElement]>top && mat[mid][maxElement]>bottom){
                int ans[]={mid,maxElement};
                return ans;
            }else if(mat[mid][maxElement]<top){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        int aa[]={-1,-1};
        return aa;
    }
}