class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> map = new HashSet<>();
        Arrays.sort(nums);
        map.add(nums[0]);
        int maxLength = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] <= 1) {
                map.add(nums[i]);
                maxLength = Integer.max(map.size(), maxLength);
            } else {
                maxLength = Integer.max(map.size(), maxLength);
                map.clear();
                map.add(nums[i]);

            }
        }
        return maxLength;
    }
}
