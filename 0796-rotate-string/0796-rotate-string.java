class Solution {
    public boolean rotateString(String s, String goal) {
        int i=0;
        StringBuilder sb=new StringBuilder(s);
        while(i<s.length()){
            char ch=sb.charAt(0);
            sb.delete(0,1);
            sb.append(ch);
            if(sb.toString().equals(goal)){
                return true;
            }
            i++;
        }
        return false;
    }
}