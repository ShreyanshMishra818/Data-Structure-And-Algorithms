class Solution {
    public int lowerbound(int a[],int target){
        int lo=0;
        int hi=a.length-1;
        int ans=a.length;
        while(hi>=lo){
            int mid=lo+(hi-lo)/2;
            if(a[mid]>=target){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public int upperbound(int a[],int target){
        int lo=0;
        int hi=a.length-1;
        int ans=a.length;
        while(hi>=lo){
            int mid=lo+(hi-lo)/2;
            if(a[mid]>target){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans-1;
    }
    public int[] searchRange(int[] nums, int target) {
        int lb=lowerbound(nums,target);
        if(lb==nums.length || nums[lb]!=target){
            int z[]={-1,-1};
            return z;
        }
        int ans[]={lb,upperbound(nums,target)};
        return ans;
    }
}