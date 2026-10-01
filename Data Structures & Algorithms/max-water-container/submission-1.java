class Solution {
    public int maxArea(int[] heights) {
        int length = heights.length;
        int result = Integer.MIN_VALUE;
        int width = length - 1;
        int left = 0;
        int right = length - 1;
        while (left < right) {
            int minHeight = Integer.min(heights[left], heights[right]);
            result=Integer.max(result,minHeight*width);
            if (minHeight == heights[right]) {
                right--;
            } else {
                left++;
            }
            width--;
        }
        return result;  
    }
}
