class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int index = 0;
        for (int num : set) {
            nums[index++] = num;
        }
        java.util.Arrays.sort(nums, 0, set.size());

        int k = set.size();
        return k;
    }
}