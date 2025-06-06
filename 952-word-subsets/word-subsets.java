import java.util.*;

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreq = new int[26];

        for (String b : words2) {
            int[] freq = count(b);
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }

        List<String> result = new ArrayList<>();
        for (String a : words1) {
            int[] freqA = count(a);
            boolean isUniversal = true;
            for (int i = 0; i < 26; i++) {
                if (freqA[i] < maxFreq[i]) {
                    isUniversal = false;
                    break;
                }
            }
            if (isUniversal) {
                result.add(a);
            }
        }

        return result;
    }

    private int[] count(String word) {
        int[] freq = new int[26];
        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }
        return freq;
    }
}
