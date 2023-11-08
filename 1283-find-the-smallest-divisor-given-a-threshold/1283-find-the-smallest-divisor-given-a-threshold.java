class Solution {
    public static boolean div(int arr[],int digit,int threshold){
        int sum[]=new int[arr.length];
        int totalsum=0;
        for(int i=0;i<arr.length;i++){
            totalsum=totalsum+(int)Math.ceil((double)arr[i]/(double)digit);
        }
        if(totalsum<=threshold){
            return true;
        }
        return false;
    }
    public static int[] minmax(int bloomDay[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int ans[]=new int[2];
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]>max){
                max=bloomDay[i];
            }
            if(bloomDay[i]<min){
                min=bloomDay[i];
            }
        }
        ans[0]=max;
        ans[1]=min;
        return ans;
    }
    public static void copy(int arr[],int nums[]){
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int ans=-1;
        int lohi[]=minmax(nums);
        int lo=1;
        int hi=lohi[0];
        while(hi>=lo){
            int mid=lo+(hi-lo)/2;
            int arr[]=new int[nums.length];
            copy(arr,nums);
            if(div(arr,mid,threshold)){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
}