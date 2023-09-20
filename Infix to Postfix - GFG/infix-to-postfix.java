//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        // Your code here
        Stack<Character> operator=new Stack<>();
        Stack<String> post=new Stack<>();
        
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            
            if(ch=='('){
                operator.push(exp.charAt(i));
            }else if((ch>='a' && exp.charAt(i)<='z') || ( ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
                post.push(ch+"");
            }else if(ch=='^' || ch=='/' || ch=='*' ||ch=='+' || ch=='-'){
                while(operator.size()>0 && operator.peek()!='(' && precedence(ch)<=precedence(operator.peek())){
                    String v2=post.pop();
                    String v1=post.pop();
                    char op=operator.pop();
                    
                    post.push(v1+v2+op);
                }
                operator.push(ch);
            }else if(ch==')'){
                while(operator.peek() !='('){
                    String v2=post.pop();
                    String v1=post.pop();
                    char op=operator.pop();
                    
                    post.push(v1+v2+op);
                }
                operator.pop();
            }
        }
        while(operator.size()>0){
            String v2=post.pop();
            String v1=post.pop();
            char op=operator.pop();
                        
            post.push(v1+v2+op);
        }
        return post.pop();
    }
    public static int precedence(char ch){
        if(ch=='^'){
            return 3;
        }else if(ch=='*' || ch=='/'){
            return 2;
        }else if(ch=='+' || ch=='-'){
            return 1;
        }else{
            return 0;
        }
    }
}