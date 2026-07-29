class Solution {
    public String simplifyPath(String path) {
       Stack<String> st = new Stack<>();
        String[]parts = path.split("/");
        //har part ko process karo //
        for(int i=0;i<parts.length;i++){
            String part = parts[i];
            if(part.isEmpty()||part.equals(".")){
                continue;
            }
            else if(part.equals("..")){
                if(st.size()!=0){
                    st.pop();
                }
            }
            else{
                st.push(part);
            }
        }
        String result="";
        while(st.size()!=0){
            result="/" + st.pop()+result;
        }
        if(result.equals("")){
            return "/";
        }
 return result;       
    }
}