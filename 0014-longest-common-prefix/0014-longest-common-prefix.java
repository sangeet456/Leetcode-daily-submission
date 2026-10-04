class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if(strs.length==0) return "";
        String first=strs[0];
        for(int i=0;i<first.length();i++){
            char c = first.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i) !=c){
                    return sb.toString();
                }
         
            }
            sb.append(c); }
   return sb.toString(); }
}