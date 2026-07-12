class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer>map2 = new HashMap<>();
        char [] ch1 = s1.toCharArray();
        char [] ch2 = s2.toCharArray();
        int left = 0;
        for(int i = 0 ;i<ch1.length;i++){
            map1.put(ch1[i],map1.getOrDefault(ch1[i],0)+1);
        }
        for(int i = 0 ;i<ch2.length;i++){
            map2.put(ch2[i],map2.getOrDefault(ch2[i],0)+1);

            if((i-left+1)>ch1.length){
                char leftchar = ch2[left];
                map2.put(leftchar,map2.get(leftchar)-1);
                left++;


                if(map2.get(leftchar) == 0){
                    map2.remove(leftchar);
                }
            }
                if((i-left+1)==ch1.length){
                    if(map2.equals(map1)){
                        return true;
                    }
                }
            }
        
        return false;
        
    }
}
