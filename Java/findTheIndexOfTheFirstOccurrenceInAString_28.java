public class findTheIndexOfTheFirstOccurrenceInAString_28 {
    /**
     * Given two strings needle and haystack, return the index of the first 
     * occurrence of needle in haystack, or -1 if needle is not part of haystack.
     * Example 1:
     *      Input: haystack = "sadbutsad", needle = "sad"
     *      Output: 0
     *      Explanation: "sad" occurs at index 0 and 6.
     *      The first occurrence is at index 0, so we return 0.
     * Example 2:
     *      Input: haystack = "leetcode", needle = "leeto"
     *      Output: -1
     *      Explanation: "leeto" did not occur in "leetcode", so we return -1.
     * 
     * APPROACH: Pattern matching search with two pointers
     */

     public static int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while ( j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
                // System.out.println(j);
                j++;
            }
            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
     }

     public static void main(String[] args) {
         String haystack = "sadbutsad";
         String needle = "sad";

         System.out.println(strStr(haystack, needle));
     }

}
