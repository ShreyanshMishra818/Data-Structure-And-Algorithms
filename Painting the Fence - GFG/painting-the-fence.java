//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
    long countWays(int n,int k)
    {
        //code here.
        long same=0;
        long diff=0;
        long total=0;
        if(n==1 && k==1){
            return 1;
        }else if(n==1 && k>1){
            return k % (1000000007);
        }else if(n>1 && k==1){
            return 0;
        }
        for(int i=2;i<=n;i++){
            if(i==2){
            same=k % (1000000007) *1;
            diff=(k % (1000000007) * (k-1) % (1000000007)) % (1000000007);
            total=(same % (1000000007) + diff % (1000000007)) % (1000000007);
            }else{
                same=diff % (1000000007);
                diff= total * (k-1) % (1000000007);
                total= (same % (1000000007) + diff % (1000000007)) % (1000000007);
            }
        }
        return total % (1000000007);
    }
}




//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
            //int n=Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] a2 = line.trim().split("\\s+");
            int n =Integer.parseInt(a2[0]);
            int k =Integer.parseInt(a2[1]);

            Solution ob=new Solution();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            long ans=ob.countWays(n,k);
            System.out.println(ans);
        }
    }
}



// } Driver Code Ends