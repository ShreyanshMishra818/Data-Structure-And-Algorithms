//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.util.HashMap;

class Largest_Subarray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int N = sc.nextInt();
            int a[] = new int[N];
            for (int i = 0; i < N; i++) 
                a[i] = sc.nextInt();
            

            Solution g = new Solution();
            int n = g.maxLen(a, a.length);

            System.out.println(n);

            T--;
        }
    }
}

// } Driver Code Ends




class Solution {

    // arr[] : the input array containing 0s and 1s
    // N : size of the input array
    
    // return the maximum length of the subarray
    // with equal 0s and 1s
    int maxLen(int[] arr, int N)
    {
        // Your code here
        for(int i=0;i<N;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }
        int presum=0;
        int ans=0;
        HashMap<Integer,Integer> h= new HashMap<>();
        for(int i=0;i<N;i++){
            presum+=arr[i];
            if(presum==0){
                ans=Math.max(ans,i+1);
            }
            if(h.containsKey(presum)){
                int g=h.get(presum);
                ans=Math.max(ans,i-g);
            }
            if(h.containsKey(presum)!=true){
                h.put(presum,i);
            }
        }
        return ans;
    }
}
