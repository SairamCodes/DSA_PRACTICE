class Solution {
    public String longestCommonPrefix(String[] strs) {

        String pre = strs[0];
        int i,j;
        for(i=1;i<strs.length;i++){
            j=0;
            while(j<Math.min(pre.length(),strs[i].length())){
                if(pre.charAt(j)!= strs[i].charAt(j)){
                    break;
                }
                j++;
            }
            pre = pre.substring(0,j);
        }
        return pre;
    }
}