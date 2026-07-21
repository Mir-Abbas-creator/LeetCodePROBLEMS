class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] a = word1.toCharArray();
        char[] b = word2.toCharArray();

        StringBuilder sb = new StringBuilder(a.length + b.length);

        int min = Math.min(a.length, b.length);

        for (int i = 0; i < min; i++) {
            sb.append(a[i]).append(b[i]);
        }

        if (a.length > min) {
            sb.append(a, min, a.length - min);
        } else if (b.length > min) {
            sb.append(b, min, b.length - min);
        }

        return sb.toString();
    }
}
