package algorithms.slidingwindow;

//https://leetcode.com/problems/maximum-average-subarray-i
//Time complexity: O(n)
//Space complexity: O(1)
public class MaximumAverageSubarrayI {

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double windowSum = 0;
        double maxSum = 0;
        if (nums.length < k) {
            System.out.println("Invalid: Window size is larger than array.");
            return -1;
        }
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        maxSum = windowSum;
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum / k;
    }
}
