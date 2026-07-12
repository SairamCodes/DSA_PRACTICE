class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.toLowerCase().replaceAll("[^a-z0-9]","");
        char [] a = ss.toCharArray();
        int start = 0;
        int end = a.length-1;
     
       while(start<end){
        if(a[start] != a[end]){
        return false;
        }
       start++;
       end--;
       }
       return true;
       }
        
        
    }

