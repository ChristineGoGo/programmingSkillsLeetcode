public class monotonicArray_896 {
    public static boolean isIncreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) return false;
        }
        return true;
    }
    public static boolean isDecreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) return false;
        }
        return true;
    }

    public static boolean isMonotonic(int[] nums) {
        int n = nums.length;
        if (n == 1) return true;
        if (isIncreasing(nums)) 
            return true;
        else if (isDecreasing(nums))
            return true;
        
        return false;

    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 2, 3};
        int[] test2 = {6, 5, 4, 4};
        int[] test3 = {1, 2, 5, 3, 3};
        System.out.println(isMonotonic(test3));
    }
}
