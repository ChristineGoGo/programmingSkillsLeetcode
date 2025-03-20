import java.util.*;


public class validAnagram_242 {
    /**
     * Given two strings s and t, return true if t is an anagram of s, 
     * and false otherwise.
     * Example 1:
     *      Input: s = "anagram", t = "nagaram"
     *      Output: true
     * Example 2:
     *      Input: s = "rat", t = "car"
     *      Output: false
     * Constraints:
     *      1 <= s.length, t.length <= 5 * 104
     *      s and t consist of lowercase English letters.
     */
    public boolean isAnagram(String s, String t) {
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        
        if (s.length() != t.length()) {
            return false;
        }
        Arrays.sort(arrS);
        Arrays.sort(arrT);


        for (int i = 0; i < arrS.length; i++) {
            if (arrS[i] != arrT[i]) {
                return false;
            }
        }

        return true;
        
    }

}
