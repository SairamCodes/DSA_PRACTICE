class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int maxarea = 0;
        int area = 1;
        int width;
        while(left<=right){
            width = right-left;
            if(heights[left] < heights[right]){
                area = width*heights[left];
                maxarea = Math.max(maxarea,area);
                left++;
            }
            else{
                area = width * heights[right];
                maxarea = Math.max(maxarea,area);
                right--;
            }

        }
        return maxarea;
    }
}
