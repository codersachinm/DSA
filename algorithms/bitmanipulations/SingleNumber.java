package algorithms.bitmanipulations;

//https://leetcode.com/problems/single-number/
//Time complexity: O(n)
//Space complexity: O(1)

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }

    public static int singleNumber(int[] nums) {
        int single = 0;
        for (int i : nums) {
            single ^= i;
        }
        return single;
    }
}
