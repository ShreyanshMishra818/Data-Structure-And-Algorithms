class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stk=new Stack<>();
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(stk.size()>0){
                    ans+='(';
                }
                stk.push('(');
            }else if(s.charAt(i)==')'){
                char ch=stk.pop();
                if(!stk.isEmpty()){
                    ans+=s.charAt(i);
                }
            }
        }
        return ans;
    }
}