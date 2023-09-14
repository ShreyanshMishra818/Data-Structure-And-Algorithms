//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s; 
            s = br.readLine();
            
            Solution obj = new Solution();
            int res = obj.checkRedundancy(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int checkRedundancy(String s) {
        // code 
        Stack<Character> stk=new Stack<>();
        stk.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==')'){
                if(stk.peek()=='('){
                    return 1;
                }
                boolean flag=false;
                while(stk.peek()!='('){
                    if(stk.peek()=='+' || stk.peek()=='-' || stk.peek()=='*' || stk.peek()=='/'){
                        flag=true;
                    }
                    stk.pop();
                }
                stk.pop();
                if(flag ==false){
                        return 1;
                    }
            }else{
                stk.push(ch);
            }
        }
        return 0;
    }
}
        
