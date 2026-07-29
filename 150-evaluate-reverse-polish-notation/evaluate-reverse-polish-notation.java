class Solution {
    static int operator (int a , int b , char tokens){
        if(tokens == '+'){
            return a+b;
        }
        if(tokens =='-'){
            return a-b;
        }
        if(tokens =='*'){
            return a*b;
        }
        else{
            return a/b;
        }
}
    public int evalRPN(String[] tokens) {
     Stack<Integer> st = new Stack<>();
     for(int i=0;i<tokens.length;i++){
        String token = tokens[i];

        if(token.equals("+") ||token.equals("-") || token.equals("*") || token.equals("/")){
            //remove top 2 element and operate//
            //then push in stack the result//
            int b = st.pop();
            int a = st.pop();
            int result = operator(a,b,token.charAt(0));
            st.push(result);
        }
        else{
            st.push(Integer.parseInt(token));
        }
     }
     return st.peek();
    }
}