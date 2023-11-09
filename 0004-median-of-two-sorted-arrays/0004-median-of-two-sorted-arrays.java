class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans=0.0;
        int m=nums1.length;
        int n=nums2.length;
        int arr[]=new int[n+m];
        int i=0,j=0;
        
        for(int k=0;k<arr.length;k++){
            if(i==nums1.length){
                arr[k]=nums2[j];
                j++;
            }else if(j==nums2.length){
                arr[k]=nums1[i];
                i++;
            }else{
                if(nums1[i]<=nums2[j]){
                    arr[k]=nums1[i];
                    i++;
                }else{
                    arr[k]=nums2[j];
                    j++;
                }
            }
        }
        
        if(arr.length%2==0){
            int mid=(arr.length-1)/2;
            ans=(double)(((double)arr[mid]+(double)arr[mid+1])/2);
        }else{
            ans=arr[(arr.length)/2];
        }
        return ans;
    }
}