public class countOddNumbersInAnIntervalRange_1523 {
    public int countOdds(int low, int high) {
        //if either low or high is odd subtract high and low and divide by 2 plus one
        if ((low % 2 != 0) || (high % 2 != 0) ) {
            return ((high - low) / 2) + 1;
        }

        return (high - low) / 2;
    }
}
