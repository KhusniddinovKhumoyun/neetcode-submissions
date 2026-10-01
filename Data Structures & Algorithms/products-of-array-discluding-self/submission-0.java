class Solution {
    public int[] productExceptSelf(int[] nums) {
            int length = nums.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int leftProduct = 1;
        for (int i = 0; i < length; i++) {
            left[i] = leftProduct;
            leftProduct *= nums[i];
        }
        int rightProduct = 1;
        for (int i = length - 1; i >= 0; i--) {
            right[i] = rightProduct;
            rightProduct *= nums[i];
        }
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }
}  
