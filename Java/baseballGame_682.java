import java.util.ArrayList;
import java.util.List;

public class baseballGame_682 {
    public int calPoints(String[] operations) {
        int result = 0;
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            int n = arr.size();

            if (operations[i].equals("D")) {
                int ress = arr.get(n - 1) * 2;
                arr.add(ress);  
            } else if (operations[i].equals("+")) {
                int ress = arr.get(n - 1) + arr.get(n - 2);
                arr.add(ress);
            } else if (operations[i].equals("C")) {
                arr.remove(arr.get(n - 1));
            } else {
                int ress = Integer.parseInt(operations[i]);
                arr.add(ress);
            }
        }

        for (int num: arr) {
            result += num;
        }

        return result;
        
    }
}
