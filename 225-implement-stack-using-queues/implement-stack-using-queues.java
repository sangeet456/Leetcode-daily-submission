class MyStack {
    Stack<Integer> st = new Stack<>();
    
    public MyStack() {
        //constructor 
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}