package algorithms.array.dp;

//https://leetcode.com/problems/maximum-subarray/description/
//Kadane’s Algorithm
//Time Complexity: O(n)
//Space Complexity: O(1)
public class MaximumSubarray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        int total = 0;

        for (int n : nums) {
            if (total < 0) {
                total = 0;
            }
            total += n;
            res = Math.max(res, total);
        }

        return res;
    }
}
