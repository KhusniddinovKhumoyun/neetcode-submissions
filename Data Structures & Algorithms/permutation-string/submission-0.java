class Solution {
    public boolean checkInclusion(String s1, String s2) {
                        int firstLength = s1.length();
        int secondLength = s2.length();
        if (secondLength < firstLength) return false;

        int[] firstArray = new int[26];
        int[] secondArray = new int[26];

        for (int i = 0; i < firstLength; i++) {
            firstArray[s1.charAt(i) - 'a']++;
            secondArray[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(firstArray, secondArray)) return true;
        int leftIndex = 0;
        for (int i = firstLength; i < secondLength; i++) {
            secondArray[s2.charAt(i) - 'a']++;
            secondArray[s2.charAt(leftIndex) - 'a']--;
            if (Arrays.equals(firstArray, secondArray)) return true;
            leftIndex++;
        }
        return false;
    }
}
