package algorithms.array;

//https://leetcode.com/problems/count-hills-and-valleys-in-an-array/

public class CountHillValley {
    public static void main(String[] args) {
        System.out.println(countHillValley(new int[]{2, 4, 1, 1, 6, 5}));
    }

    public static int countHillValley(int[] nums) {
        //[2,4,1,1,6,5]
        int count = 0;
        int left = 0;

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                if (nums[i] > nums[left] && nums[i] > nums[i + 1] ||
                        nums[i] < nums[left] && nums[i] < nums[i + 1]) {
                    count++;
                }
                left = i;
            }
        }
        return count;
    }
}
