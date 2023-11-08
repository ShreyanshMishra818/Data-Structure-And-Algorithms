class Solution {
    public static int[] minmax(int arr[]){
        int min=Integer.MIN_VALUE;
        int max=0;
        for(int i=0;i<arr.length;i++){
            min=Math.max(min,arr[i]);
            max+=arr[i];
        }
        int res[]={min,max};
        return res;
    }
    public static boolean cal(int arr[],int days,int mid){
        int count=0,totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
            if(totalSum>mid){
                count+=1;
                totalSum=arr[i];
            }
        }
        count+=1;
        if(count<=days){
            return true;
        }
        return false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int res[]=minmax(weights);
        int lo=res[0];
        int hi=res[1];
        int ans=0;
        while(hi>=lo){
            int mid=lo+(hi-lo)/2;
            if(cal(weights,days,mid)){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
}