class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minstack;

    public MinStack() {

       stack = new Stack<>();
        minstack = new Stack<>();
        
        
    }
    
    public void push(int val) {

        stack.push(val);

        if(minstack.isEmpty()){
            minstack.push(val);
        }
        else{
           int currentmin = minstack.peek();

            minstack.push(Math.min(currentmin,val));
        }
        
    }
    
    public void pop() {

       
            stack.pop();
            minstack.pop();
        
        
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
