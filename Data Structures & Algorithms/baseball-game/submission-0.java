class Solution {
    public int calPoints(String[] operations) {
     Stack<Integer> stack = new Stack<>();
     int sum = 0;
     for(String op : operations){
        if(op.equals("+")){
            int top = stack.pop();
            int second = stack.peek();
            int newsum = top+second;

            stack.push(top);
            stack.push(newsum);
        }
        else if(op.equals("C")){
            stack.pop();
        }
        else if(op.equals("D")){
            int top =  stack.peek();
            int newmul = top*2;

            stack.push(newmul);
        }
        else{
            stack.push(Integer.parseInt(op));
        }
     }
     for(int score : stack){
        sum += score;
     }
     return sum;
    }
}