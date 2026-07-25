class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int val : asteroids){
            boolean exploded = false;
       while(!stack.isEmpty() && stack.peek() > 0 && val <0){
            if(stack.peek() == -(val)){
                stack.pop();
            }
            else if(stack.peek() < -(val)){
                stack.pop();
                continue;
            }
            exploded = true;
            break;
        }
        if (!exploded) {
                stack.push(val);
            }
        }

       int[] result = new int[stack.size()];
       for (int i = stack.size() - 1; i >= 0; i--) {
         result[i] = stack.pop();
           }
      return result; 
    }
}