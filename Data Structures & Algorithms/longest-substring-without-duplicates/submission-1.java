class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> window = new HashSet<>();
        int l = 0;
        int length = 0;
        char[] chars = s.toCharArray();
        for (int r = 0; r < chars.length; r++) {
            while (window.contains(chars[r])) {
                window.remove(chars[l]);
                l++;
            }
            window.add(chars[r]);
            length = Math.max(length, r - l + 1);   
        }
        return length;
    }
}
