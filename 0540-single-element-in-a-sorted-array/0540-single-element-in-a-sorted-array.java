class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int lo=1;
        int hi=n-2;
        int ans=0;
        if(n==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        while(hi>=lo){
            int mid=(lo+hi)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                ans=nums[mid];
                return ans;
            }else if(nums[mid]==nums[mid+1] && mid%2!=0 && (mid+1)%2==0){
                hi=mid-1;
            }else if(nums[mid]==nums[mid+1] && mid%2==0 && (mid+1)%2!=0){
                lo=mid+1;
            }else if(nums[mid]==nums[mid-1] && mid%2!=0 && (mid-1)%2==0){
                lo=mid+1;
            }else if(nums[mid]==nums[mid-1] && mid%2==0 && (mid-1)%2!=0){
                hi=mid-1;
            }
        }
        return ans;
    }
}