class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
        int n = ch1.length+ch2.length;
        StringBuilder arr = new StringBuilder();

        int i = 0;
        int j = 0;
        while(i<ch1.length || j< ch2.length){
            if (i<ch1.length){
                arr.append(ch1[i]);
                i++;
            }
            if(j<ch2.length){
                arr.append(ch2[j] );
                j++;
            }
        }
        return arr.toString();
    }
}