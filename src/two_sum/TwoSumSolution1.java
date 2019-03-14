package two_sum;

public class TwoSumSolution1 {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 8, 5};
        int[] results = twoSum(nums, 9);
        System.out.println(results[0] + "  " + results[1]);
    }
}
