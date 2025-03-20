import java.util.*;

public class findTheDifference_389 {
    public char findTheDifference(String s, String t) {
        if (s.length() == 0) {
            return t.charAt(s.length());
        }
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
    

        Arrays.sort(arrS);
        Arrays.sort(arrT);
        for (int i = 0; i < arrT.length; i++) {
            if (i >= arrS.length) {
                return arrT[arrS.length];
            } else if (arrS[i] != arrT[i]) {
                return arrT[i];
            }
        }
        char ans = t.charAt(s.length());
        return ans;
    }
    }
}
