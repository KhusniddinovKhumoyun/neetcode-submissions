class Solution {
    public int characterReplacement(String s, int k) {
        
        int length = s.length();
        int[] freqElements = new int[26];
        int maxFreqCount = 0;
        int maxWindowSize = 0;
        int left = 0;
        for (int right = 0; right < length; right++) {


            freqElements[s.charAt(right) - 'A']++;
            maxFreqCount = Integer.max(maxFreqCount, freqElements[s.charAt(right) - 'A']);

            int windowSize = right - left + 1;

            if (windowSize - maxFreqCount > k) {
               freqElements[s.charAt(left)-'A']--;
                left++;
            }

               windowSize=right-left+1;
            maxWindowSize = Integer.max(windowSize, maxWindowSize);
        }

        return maxWindowSize;
    }
}
