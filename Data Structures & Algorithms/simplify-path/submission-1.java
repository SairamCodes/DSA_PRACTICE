class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");
        for(String p : parts){
            if(p.isEmpty() || p.equals(".")){
                continue;
            }
           if(p.equals("..") ){
           if(!stack.isEmpty()){
                stack.pop();
            }
           }
            else{
                stack.push(p);
            }
        }   
        return "/" + String.join("/", stack);
   
    }
}