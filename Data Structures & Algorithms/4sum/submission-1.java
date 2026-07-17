class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        long targetsum = 0;
        Arrays.sort(nums);
        if(nums==null || nums.length<4){
            return ans;
        }
        for(int i = 0;i<nums.length-3;i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j = i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j] == nums[j-1]){
                continue;
            }
                targetsum = (long)target - (nums[i]+nums[j]);
                int left = j+1;
                int right = nums.length-1;
                while(left<right){
                    if((nums[left]+nums[right])<targetsum ){
                        left++;
                    }
                    else if((nums[left] + nums[right]) > targetsum){
                        right--;
                    }
                    else{
                        List<Integer> res = new ArrayList<>();
                        res.add(nums[i]);
                        res.add(nums[j]);
                        res.add(nums[left]);
                        res.add(nums[right]);
                        ans.add(res);
                      while (left < right && nums[left] == nums[left + 1]){
                        left++;
                      }
                      while (left < right && nums[right] == nums[right - 1]){
                        right--;
                      }
                      left++;
                      right--;
                    }
                }
            }
        }
        return ans;
    }
}