class Solution {
    public void reverseString(char[] s) {
        
        int i;
        int j;
        int k = s.length;
        for(i=0;i<k/2;i++){
            j = k - 1 - i;
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    return;
}
}