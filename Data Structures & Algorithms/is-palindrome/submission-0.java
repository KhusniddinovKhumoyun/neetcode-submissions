class Solution {
 public static boolean isPalindrome(String s) {
        String t = s.trim().toLowerCase();
        if (t.isEmpty()) return true;
        char[] str = t.toCharArray();
        int length = str.length;
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (canAdd(str[i])) {
                a.append(str[i]);
            }
            if (canAdd(str[length - 1 - i])) {
                b.append(str[length - 1 - i]);
            }
        }
        return a.toString().contentEquals(b);
    }

    public static boolean canAdd(char a) {
             return (a >= '0' && a <= '9') || (a >= 97 && a <= 122);
    }
}
