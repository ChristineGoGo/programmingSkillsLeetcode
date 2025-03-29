import java.util.HashMap;
import java.util.Map;

public class robotReturnToOrigin_657 {
        public boolean judgeCircle(String moves) {
        int result = 0;
        Map<Character, Integer> sequences = new HashMap<>();
        // populate the hashmap
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'R') sequences.put('R', 1);
            if (moves.charAt(i) == 'L') sequences.put('L', -1);
            if (moves.charAt(i) == 'U') sequences.put('U', 20);
            if (moves.charAt(i) == 'D') sequences.put('D', -20);
        }
        // traverse and move through the sequences
        for (int i = 0; i < moves.length(); i++) {
            result += sequences.get(moves.charAt(i));
        }

        return result == 0 ? true  : false;
    }

}
