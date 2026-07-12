class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j,k;
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                k = nums[i] + nums[j];
                if(k== target){
                   return new int[]{i,j};
                }
            }
        }
        return new int[]{};
        
    }
}
