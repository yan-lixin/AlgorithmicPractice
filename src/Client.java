import two_sum.TwoSumSolution1;

public class Client {

    public static void main(String[] args) {
        int[] nums = {2, 4, 8, 5};
        int[] results = TwoSumSolution1.twoSum(nums, 9);
        System.out.println(results[0] + "  " + results[1]);
    }

}
