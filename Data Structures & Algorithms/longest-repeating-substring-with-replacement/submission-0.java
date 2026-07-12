class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0;
        int maxfreq = 0;
        int left = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        char [] ch = s.toCharArray();
        for(int right = 0 ; right < ch.length;right++){
            map.put(ch[right],map.getOrDefault(ch[right],0)+1);
            maxfreq = Math.max(maxfreq,map.get(ch[right]));

            if(((right-left + 1) - maxfreq)>k){
                char leftchar = ch[left];
                map.put(leftchar,map.get(leftchar)-1);
                left++;
            }
            ans = Math.max(ans,(right-left+1));
        }
        return ans;

        
    }
}
