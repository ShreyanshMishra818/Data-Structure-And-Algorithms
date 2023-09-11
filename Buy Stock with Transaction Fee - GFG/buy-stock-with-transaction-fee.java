//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            long []prices=new long[N];
            for(int i=0;i<N;i++){
                prices[i]=sc.nextLong();
            }
            int fee=sc.nextInt();
            Solution obj=new Solution();
            long res=obj.maximumProfit(prices,N,fee);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public long maximumProfit(long prices[], int N, int fee){
        // Code here
        long extrastock= -prices[0];
        long noextra=0;
        
        for(int i=1;i<N;i++){
           long newextrastock=Math.max(extrastock,noextra-prices[i]);
           long newnoextra=Math.max(noextra, prices[i]-fee+extrastock);
           
           extrastock=newextrastock;
           noextra=newnoextra;
        }
        return noextra;
    }
}