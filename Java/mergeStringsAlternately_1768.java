public class mergeStringsAlternately_1768 {
    /**
     * You are given two strings word1 and word2. Merge the 
     * strings by adding letters in alternating order, starting with word1. 
     * If a string is longer than the other, append the additional letters onto 
     * the end of the merged string.
     * Return the merged string.
     *  Example 1:
     *      Input: word1 = "abc", word2 = "pqr"
     *      Output: "apbqcr"
     *      Explanation: The merged string will be merged as so:
     *      word1:  a   b   c
     *      word2:    p   q   r
     *      merged: a p b q c r
     *  Example 2:
     *      Input: word1 = "ab", word2 = "pqrs"
     *      Output: "apbqrs"
     *      Explanation: Notice that as word2 is longer, "rs" is appended to the end.
     *      word1:  a   b 
     *      word2:    p   q   r   s
     *      merged: a p b q   r   s
     *  Example 3:
     *      Input: word1 = "abcd", word2 = "pq"
     *      Output: "apbqcd"
     *      Explanation: Notice that as word1 is longer, "cd" is appended to the end.
     *      word1:  a   b   c   d
     *      word2:    p   q 
     *      merged: a p b q c   d
     * 
     */
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length() <= word2.length() ?  word1.length() : word2.length();
        String longer = word1.length() > word2.length() ? word1 : word2;
        String merged = "";

        for (int i = 0; i < n; i++) {
            merged = merged + word1.charAt(i);
            merged = merged + word2.charAt(i);
        }

        if (word1.length() != word2.length()) {
            String appendToMerged = longer.substring(n, longer.length());
            merged += appendToMerged;
        }
      

        return merged;
    }

}
