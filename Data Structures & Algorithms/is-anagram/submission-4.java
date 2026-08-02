class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        if(ch1.length != ch2.length){
            return false;
        }
        for(int i =0;i<ch1.length ; i++){
            map1.put(ch1[i],map1.getOrDefault(ch1[i],0)+1);
            map2.put(ch2[i],map2.getOrDefault(ch2[i],0)+1);
        }
        if(!map1.equals(map2)){
            return false;
        }
        else
        return true;
 
 }
}