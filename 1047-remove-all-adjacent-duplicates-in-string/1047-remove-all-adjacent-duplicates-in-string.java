class Solution {
    public String removeDuplicates(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(char c : arr){
            if(!st.isEmpty() && st.peek()==c){
                st.pop();
            }
            else{ st.push(c);
        }}
           StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.insert(0, st.pop());

   }

   return result.toString() ;}
}