
import java.util.Arrays;

public class moveZeroes_283 {
    /**
     * Given an integer array nums, move all 0's to the end of it while 
     * maintaining the relative order of the non-zero elements.Note that 
     * you must do this in-place without making a copy of the array.
     */

    public static void moveZeroes(int[] nums) {
        int left = 0, right = 0, n = nums.length;

        while (left < n) {
            if (nums[left] == 0) {
                while (right < n) {
                    if (nums[right] != 0) {
                        int temp = nums[right];
                        nums[left] = temp;
                        nums[right] = 0;
                        break;
                    }
                    right++;
                }
            }
            left++;
            right = left;
        }

    }

    public static void main(String[] args) {
        int[] testNums = {0, 1, 0, 3, 12};
        int[] testNums1 = {0};

        moveZeroes(testNums);
        moveZeroes(testNums1);
        System.out.println(Arrays.toString(testNums1)); 
    }

}
