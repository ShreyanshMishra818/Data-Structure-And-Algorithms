//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class PhoneDigit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//testcases
        
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); // input size of array
            int arr[] = new int[n]; //input the elements of array that are keys to be pressed
            
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();//input the elements of array that are keys to be pressed
            ArrayList <String> res = new Solution().possibleWords(arr, n);
            for (String i : res) System.out.print (i + " ");
             System.out.println();
              
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here  
        String codes[]={"0","0","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String str="";
        for(int i=0;i<a.length;i++){
            str+=a[i];
        }
        return ways(str,codes);
    }
    public static ArrayList<String> ways(String str,String codes[]){
        if(str.length()==0){
            ArrayList<String> a=new ArrayList<>();
            a.add("");
            return a;
        }
        String s=str.substring(0,1);
        String rest=str.substring(1);
        ArrayList<String> res=ways(rest,codes);
        
        ArrayList<String> ans=new ArrayList<>();
        String now=codes[Integer.parseInt(s)];
        for(int i=0;i<now.length();i++){
            char chs=now.charAt(i);
            for(String rste:res){
                ans.add(chs+rste);
            }
        }
        return ans;
    }
}


