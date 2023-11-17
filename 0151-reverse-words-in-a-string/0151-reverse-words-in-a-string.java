class Solution {
    public String reverseWords(String s) {
        String word="",ans="";
        ArrayList<String> stro=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z')||Character.isDigit(s.charAt(i))){
                word+=s.charAt(i);
            }else{
                if(word!=""){
                 stro.add(word);   
                }
                word="";
            }
        }
        if(word!=""){
                 stro.add(word);   
                }
        for(int i=stro.size()-1;i>0;i--){
            ans+=stro.get(i);
            ans+=" ";
        }
        ans+=stro.get(0);
        return ans;
    }
}