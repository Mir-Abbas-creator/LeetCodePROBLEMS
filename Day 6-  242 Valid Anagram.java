class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths do not match, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Array to store counts of 26 lowercase English letters
        int[] charCounts = new int[26];

        // Increment for string s and decrement for string t
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        // If any count is not zero, the strings are not anagrams
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
