class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        int n = words.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String a = words[i], b = words[j];
                if (b.startsWith(a) && b.endsWith(a)) {
                    count++;
                }
            }
        }
        return count;
    }
}
