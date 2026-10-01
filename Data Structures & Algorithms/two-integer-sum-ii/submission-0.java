class Solution {
    public int[] twoSum(int[] numbers, int target) {
            int[] result = new int[2];
        int length = numbers.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (numbers[j] + numbers[i] == target) {
                    result[0] = i+1;
                    result[1] = j+1;
                    return result;
                }
            }
        }
        return result;
    }
}
