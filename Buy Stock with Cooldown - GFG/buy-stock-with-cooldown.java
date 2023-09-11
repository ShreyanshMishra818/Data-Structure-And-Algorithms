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
            Solution obj=new Solution();
            long res=obj.maximumProfit(prices,N);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public long maximumProfit(long prices[], int N){
        //Code here
        long bsp= -prices[0];
        long ssp=0;
        long csp=0;
        
        for(int i=1;i<N;i++){
           long nbsp= Math.max(bsp, csp-prices[i]);
           long nssp= Math.max(ssp, prices[i]+bsp);
           long ncsp= Math.max(csp, ssp);
            
            bsp= nbsp;
            ssp=nssp;
            csp=ncsp;
        }
        return ssp;
    }
}
