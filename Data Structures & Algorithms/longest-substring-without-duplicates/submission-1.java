class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        char []  ch = s.toCharArray();
         HashSet<Character> set = new HashSet<>();
         int left = 0;
         for(int i = 0 ;i<ch.length;i++){
            while(set.contains(ch[i])){
                set.remove(ch[left]);
                left++;
            }
            set.add(ch[i]);
            max = Math.max(max,i-left+1);
         }
         return max;
    }
}
