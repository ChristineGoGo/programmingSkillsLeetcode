import java.util.*;

public class romanToInteger_13 {
    public static  int romanToInt(String s) {
        //use hashmaps to store the symbols and values
        Map<Character, Integer> symbols = new HashMap<>();
        symbols.put('I',1);
        symbols.put('V',5);
        symbols.put('X',10);
        symbols.put('L',50);
        symbols.put('C',100);
        symbols.put('D',500);
        symbols.put('M',1000);

        // use hashmap to store the 6 instances where we need to subtract from the value
        Map<Character, Character> specials = new HashMap<>();
        specials.put('V', 'I');
        specials.put('X', 'I');
        specials.put('L', 'X');
        specials.put('C', 'X');
        specials.put('D', 'C');
        specials.put('M', 'C');

        // create integer to store the result
        int result = 0;

        //loop through the given string to find the result accounting for special instances
        for (int i = s.length() - 1; i >= 0; i--) {
            char current = s.charAt(i);

            if (specials.get(current) != null & i >= 1) {
                if (s.charAt(i - 1) == specials.get(current)) {
                    result += symbols.get(current);
                    result -= symbols.get(s.charAt(i - 1));
                    i--;
                    continue;
                }
            } 
            result += symbols.get(current);
        }

        return result;
  
    }


    public static void main(String[] args) {
        String test1 = "MCMXCIV";
        System.out.println(romanToInt(test1));
    }
}
