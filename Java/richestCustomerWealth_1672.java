public class richestCustomerWealth_1672 {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int maxWealth = 0;

        for (int i = 0; i < n; i++) {
            int currentWealth = 0;
            for ( int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }
            maxWealth =  currentWealth > maxWealth ? currentWealth : maxWealth;
        }

        return maxWealth;
        
    }

}
