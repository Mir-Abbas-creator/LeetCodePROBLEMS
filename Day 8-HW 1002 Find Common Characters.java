import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] words) {
        int[] minFrequencies = new int[26];
        Arrays.fill(minFrequencies, Integer.MAX_VALUE);
        for (String word : words) {
            int[] charFrequencies = new int[26];
            for (char c : word.toCharArray()) {
                charFrequencies[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                minFrequencies[i] = Math.min(minFrequencies[i], charFrequencies[i]);
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (minFrequencies[i] > 0) {
                result.add(String.valueOf((char) (i + 'a')));
                minFrequencies[i]--;
            }
        }
        
        return result;
    }
}
