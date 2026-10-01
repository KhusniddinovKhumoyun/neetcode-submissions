class Solution {
    public int[] topKFrequent(int[] nums, int k) {
                       HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer count = map.get(num);
            if (count == null) count = 0;
            map.put(num, ++count);
        }
        List<Integer>[] bucket = new List[nums.length + 1];

//        for (int i = 0; i < bucket.length; i++) {
//            bucket[i] = new ArrayList<>();
//        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int freqElement = entry.getValue();
            int number = entry.getKey();
            if (bucket[freqElement] == null) bucket[freqElement] = new ArrayList<>();
            bucket[freqElement].add(number);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && result.size() < k; i--) {
            if(bucket[i]!=null)
            result.addAll(bucket[i]);
        }
        int[] arrResult = new int[result.size()];
        for (int i = 0; i < arrResult.length ; i++) {
            arrResult[i] = result.get(i);
        }
        return arrResult;
    }
}
