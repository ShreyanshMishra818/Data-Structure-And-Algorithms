class Solution {
    public static int findHour(int piles[],int x){
        int totalHour=0;
        for(int i=0;i<piles.length;i++){
            ;
            totalHour+=Math.ceil((double)piles[i]/(double)x);
        }
        return totalHour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int lo=1;
        int hi=piles[piles.length-1];
        int ans=Integer.MAX_VALUE;
        while(hi>=lo){
            int mid=(lo+hi)/2;
           
            if(findHour(piles,mid)<=h){
                ans=Math.min(ans,mid);
                hi=mid-1;
            }else{
                ans=Math.min(ans,mid);
                lo=mid+1;
            }
        }
        return lo;
    }
}