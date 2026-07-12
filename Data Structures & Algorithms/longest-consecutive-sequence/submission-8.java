class Solution {
    public int longestConsecutive(int[] nums) {
       Arrays.sort(nums);

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
        int longs = 0;
        for(int num : set){

        if(!set.contains(num-1)){
            int current = num;
            int length = 1;

            while(set.contains(current+1)){
                length++;
                current++;
            }
          longs = Math.max(longs,length);

        }
        }
         return longs;
        
    }
}
