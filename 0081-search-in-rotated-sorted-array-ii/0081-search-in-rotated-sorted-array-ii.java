class Solution {
    public boolean search(int[] nums, int target) {
        int lo=0;
        int hi=nums.length-1;
        Arrays.sort(nums);
        while(hi>=lo){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                return true;
            }else if(nums[mid]>target){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return false;
    }
}