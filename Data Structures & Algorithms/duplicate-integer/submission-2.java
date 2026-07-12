class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
       int n = set.size();
        return n != nums.length;
    }
}
        