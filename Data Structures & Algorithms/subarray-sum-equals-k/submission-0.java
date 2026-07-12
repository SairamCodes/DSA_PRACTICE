class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int i,j;
        int count =0;
        int sum;
        for(i=0;i<nums.length;i++){
            sum =0;
            for(j=i;j<nums.length;j++){
                sum += nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}