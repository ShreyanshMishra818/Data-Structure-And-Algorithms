class Solution {
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
    public static boolean check(int arr[],int day,int m,int k){
        int count=0;
        int total=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                count+=1;
            }else{
                total+=count/k;
                count=0;
            }
        }
        total+=count/k;
        if(total>=m){
            return true;
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int ans=-1;
        int lohi[]=minmax(bloomDay);
        int lo=lohi[1];
        int hi=lohi[0];
        while(hi>=lo){
            int mid=lo+(hi-lo)/2;
            if(check(bloomDay,mid,m,k)){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
}