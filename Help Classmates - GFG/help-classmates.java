//{ Driver Code Starts
//Initial Template for Java


import java.util.*; 
import java.io.*; 

class GFG 
{ 
	public static void main (String[] args) { 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            int array[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }

            Solution ob = new Solution();

            int ans[] = ob.help_classmate(array,n);

           	for (int i=0; i<n; i++) 
                System.out.print(ans[i]+" "); 
            System.out.println();
            t--;
        }
	} 
} 


// } Driver Code Ends


//User function Template for Java

class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    // Your code goes here
	    int ans[]=new int[arr.length];
	    ans[arr.length-1]=-1;
	    Stack<Integer> stk=new Stack<>();
	    stk.push(arr[arr.length-1]);
	    for(int i=arr.length-2;i>=0;i--){
	        while(stk.size()>0 && arr[i]<=stk.peek()){
	            stk.pop();
	        }
	        if(stk.size()==0){
	            ans[i]=-1;
	        }else{
	            ans[i]=stk.peek();
	        }
	        stk.push(arr[i]);
	    }
	    return ans;
	} 
}
