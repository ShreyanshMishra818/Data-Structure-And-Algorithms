//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String S = sc.nextLine().trim();
            Solution ob = new Solution();
            if(ob.valid(S))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean valid(String s) 
    { 
        // code here
        Stack<Character> stk=new Stack<>();
        stk.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                stk.push(ch);
            }else{
                if(stk.size()==0){
                    return false;
                }
                char chs=stk.peek();
                if(ch==')' && chs=='('){
                    stk.pop();
                }else if(ch==']' && chs=='[') {
                   stk.pop();
                }else if(ch=='}' && chs=='{'){
                   stk.pop();
                }else{
                    return false;
                }
            }
        }
        if(stk.size()==0){
            return true;
        }else{
            return false;
        }
        
    }
} 