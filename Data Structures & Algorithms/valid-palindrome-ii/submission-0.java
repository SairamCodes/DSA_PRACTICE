class Solution {
    public boolean validPalindrome(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]!=arr[right]){
            return isPallindrome(s,left+1,right) || isPallindrome(s,left,right-1);

        }

        left++;
        right--;
        }
        return true;
    }
        boolean isPallindrome(String s ,int left,int right){
            char [] arr = s.toCharArray();

            while(left<right){
                if(arr[left]!= arr[right]){
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
        
    }
