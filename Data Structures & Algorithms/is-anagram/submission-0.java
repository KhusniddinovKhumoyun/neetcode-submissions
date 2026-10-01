class Solution {
    public boolean isAnagram(String s, String t) {
 int firstLength = s.length();
        int secondLength = t.length();
        if (firstLength != secondLength) return false;
        
        int[] first = new int[firstLength];
        int[] second = new int[secondLength];
        
        for (int i = 0; i < firstLength; i++) {
            first[i] = s.charAt(i);
            second[i] = t.charAt(i);
        }
        int[] firstResult = Arrays.stream(first).sorted().toArray();
        int[] secondResult = Arrays.stream(second).sorted().toArray();
        
        for (int i = 0; i < firstLength; i++) {
            if (firstResult[i] != secondResult[i]) return false;
        }
        return true;
    }
}
