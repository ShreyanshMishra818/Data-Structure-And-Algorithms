class Solution {
    public int findMin(int[] nums) {
        int lo=0;
        int hi=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(hi>=lo){
            int mid=lo+(hi-lo)/2;
            if(nums[lo]<=nums[mid]){
                ans=Math.min(ans,nums[lo]);
                lo=mid+1;
            }else if(nums[mid]<=nums[hi]){
                ans=Math.min(ans,nums[mid]);
                hi=mid-1;
            }
        }
        return ans;
    }
}