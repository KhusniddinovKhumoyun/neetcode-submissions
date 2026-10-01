class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if (length <= 1) return length;
        int result = 1;
        Set<Character> characters = new HashSet<>();
        characters.add(s.charAt(0));
        int start = 0;
        for (int i = 1; i < length; i++) {
            if (!characters.add(s.charAt(i))) {
                while (start < i) {
                    if (s.charAt(start) != s.charAt(i)) {
                        characters.remove(s.charAt(start));
                        start++;
                    } else {
                        characters.remove(s.charAt(start));
                         characters.add(s.charAt(i));
                        start++;
                        break;
                    }
                }
            }
               result = Integer.max(result,characters.size());
        }
        return result;
    }
}
