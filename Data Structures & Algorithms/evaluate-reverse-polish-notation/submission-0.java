class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
         for(String token : tokens)
        if(token.equals("+")){
            int first = stack.pop();
            int second = stack.pop();

            int add = second + first;

            stack.push(add);
        }
        else if(token.equals("-")){
            int first = stack.pop();
            int second = stack.pop();

            int add = second - first;

            stack.push(add);
        }
        else if(token.equals("*")){
             int first = stack.pop();
            int second = stack.pop();

            int add = second * first;

            stack.push(add);
        }
        else if(token.equals("/")){
             int first = stack.pop();
            int second = stack.pop();

            int add = second / first;

            stack.push(add);
        }
        else{
            stack.push(Integer.parseInt(token));
        }
        return stack.peek();
    }
}
