//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.firstIndex(a, n));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public long firstIndex(long arr[], long n)
    {
        // Your code goes here
        int low=0;
        int high=arr.length-1;
        
        while(high>=low){
            int mid=low+(high-low)/2;
            
            if(arr[mid]==1 && (mid==0 || arr[mid-1]==0 )){
                return mid;
            }else if(arr[mid]<1){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}