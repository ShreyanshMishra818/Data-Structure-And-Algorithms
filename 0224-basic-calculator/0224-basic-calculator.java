class Solution {
    public int calculate(String s) {
        Stack<Integer> stk=new Stack<>();
        
        int sum=0;
        int sign=1;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='('){
                stk.push(sum);
                stk.push(sign);
                sum=0;
                sign=1;
            }else if(ch=='+'){
                sign=1;
            }else if(ch=='-'){
                sign=-1;
            }else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                int num=0;
                while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
                    num= num *10 +(s.charAt(i)-'0');
                    i++;
                }
                sum+=num*sign;
                i--;
            }else if(ch==')'){
                
                    sum=stk.pop()*sum;
                    sum+=stk.pop();
                
            }
        }
        return sum;
    }
}