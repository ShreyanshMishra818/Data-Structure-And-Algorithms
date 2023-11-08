class Solution {
    public int findKthPositive(int[] arr, int k) {
        Arrays.sort(arr);
        int last=arr[arr.length-1];
      
        int a[]=new int[last+1];
        for(int i=0;i<arr.length;i++){
            a[arr[i]]=1;
        }
        a[0]=1;
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int j=0;
        int s=1;
        for(;s<a.length;s++){
            if(k==0){
                break;
            }
            if(a[s]==0){
                k=k-1;
            }
        }
        if(k>0){
            return s+k-1;
        }
        return s-1;
    }
}