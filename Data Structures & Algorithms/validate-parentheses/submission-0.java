class Solution {
public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (addableToStack(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) return false;
                if (popFromStack(stack.peek(), s.charAt(i))) stack.pop();
                else return false;
            }
        }
       return stack.isEmpty();
    }

    public static Boolean addableToStack(Character character) {
        return character == '[' || character == '{' || character == '(';
    }

    public static boolean popFromStack(Character characterFromStack, Character newCharacter) {
        return characterFromStack == '{' && newCharacter == '}' || characterFromStack == '[' && newCharacter == ']' || characterFromStack == '(' && newCharacter == ')';
    }
}
