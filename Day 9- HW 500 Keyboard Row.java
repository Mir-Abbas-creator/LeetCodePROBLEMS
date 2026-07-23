import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {
        int[] charToRow = new int[26];
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        
        for (int i = 0; i < rows.length; i++) {
            for (char c : rows[i].toCharArray()) {
                charToRow[c - 'a'] = i;
            }
        }
        
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            if (word.isEmpty()) continue;
            
            String lowerWord = word.toLowerCase();
            int targetRow = charToRow[lowerWord.charAt(0) - 'a'];
            boolean valid = true;
            
            for (int i = 1; i < lowerWord.length(); i++) {
                if (charToRow[lowerWord.charAt(i) - 'a'] != targetRow) {
                    valid = false;
                    break;
                }
            }
            
            if (valid) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[0]);
    }
}
