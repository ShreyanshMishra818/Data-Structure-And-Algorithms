class Solution {
   public static int[] minmax(int arr[]){
        int min=Integer.MIN_VALUE;
        int max=0;
        for(int i=0;i<arr.length;i++){
            min=Math.max(min,arr[i]);
            max+=arr[i];
        }
        int ans[]={min,max};
        return ans;
    }
    public static int isPossible(int nums[],int mid){
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=mid){
                sum+=nums[i];
            }else{
                count++;
                sum=nums[i];
            }
        }
        return count+1;
    }
    public int splitArray(int[] nums, int k) {
        int mm[]=minmax(nums);
        int lo=mm[0];
        int hi=mm[1];
        int ans=0;
        while(hi>=lo){
            int mid=lo+(hi-lo)/2;
            if(isPossible(nums,mid)>k){
                lo=mid+1;
            }else{
                ans=mid;
                hi=mid-1;
            }
        }
        return ans;
    }
}