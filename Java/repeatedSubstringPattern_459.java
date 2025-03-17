public class repeatedSubstringPattern_459 {
    
    /**
     * Given a string s, check if it can be constructed by taking a substring of 
     * it and appending multiple copies of the substring together.
     * Example 1:
     * Input: s = "abab"
     * Output: true
     * Explanation: It is the substring "ab" twice.
     */

    public boolean repeatedSubStringPattern(String s) {
        int n = s.length();
        int[] frequencies = new int[n];

        for (int i = 1; i < n; ++i ) {
            int j = frequencies[i - 1];

            while (j > 0 && (s.charAt(i) != s.charAt(j))) {
                j = frequencies[j - 1];
            }

            if (s.charAt(i) == s.charAt(j)) j++;
            
            frequencies[i] = j;
        }
        int longest = frequencies[n - 1];

        return (longest != 0) && (longest % (n - longest) == 0);
    }

    public static void main(String[] args) {
        String q = "oatmilk";
        int n = q.length();
        int[] lps = new int[n];
        System.out.println(lps[6]);
    }

}
