class Solution {
    public boolean detectCapitalUse(String word) {
        int uppercaseCount = 0;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                uppercaseCount++;
            }
        }
        if (uppercaseCount == len || uppercaseCount == 0) {
            return true;
        }
        return uppercaseCount == 1 && Character.isUpperCase(word.charAt(0));
    }
}
