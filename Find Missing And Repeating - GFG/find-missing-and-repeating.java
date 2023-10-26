//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int a[]=new int[n+1];
        a[0]=-1;
        for(int i=0;i<n;i++){
            a[arr[i]]++;
            
        }
        int c=0,b=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==2){
                b=i;
            }
            if(a[i]==0){
                c=i;
            }
        }
        int ans[]=new int[2];
        ans[0]=b;
        ans[1]=c;
        return ans;
    }
}