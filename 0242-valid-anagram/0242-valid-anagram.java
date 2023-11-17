class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr1[s.charAt(i)-'0'-49]++;
            arr2[t.charAt(i)-'0'-49]++;
        }
        System.out.print('a'-'0');
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
//         HashMap<Character,Integer> map1=new HashMap<>();
//         HashMap<Character,Integer> map2=new HashMap<>()
            
//         for(int i=0;i<s.length;i++){
//             char ch1=s.charAt(i);
//             char ch2=s.charAt(i);
            
//             if(map1.containsKey(ch1)){
//                 int val=map1.valueOf(ch1);
//                 map1.put(ch1,val+1);
//             }else{
//                 map1.put(ch1,1);
//             }
//             if(map2.containsKey(ch2)){
//                 int val=map2.valueOf(ch2);
//                 map2.put(ch2,val+1);
//             }else{
//                 map2.put(ch2,1);
//             }
//         }
        
        
        
    }
}