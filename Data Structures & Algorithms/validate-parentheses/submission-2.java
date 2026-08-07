class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');
        Stack stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (!stack.isEmpty() && stack.peek() == brackets.get(c)) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
