class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){

            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

           int target = -nums[i];
           int left = i+1;
           int right = nums.length-1;

           while(left<right){
            if((nums[left] + nums[right]) > target){
                right--;

            }
            else if ((nums[left] + nums[right]) < target){
                left++;
            }
            else{
                List<Integer> res = new ArrayList<>();
            res.add(nums[i]);
              res.add(nums[left]);
              res.add(nums[right]);
              ans.add(res);

              left++;
              right--;
              while(left<right&& nums[left] == nums[left-1]){
                left++;
              }
              while(left<right && nums[right] == nums[right+1]){
                right--;
              }

            }
           }
        }
        return ans;
    }
}
