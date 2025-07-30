package algorithms.algos;

//https://leetcode.com/problems/majority-element
//Time Complexity: O(n)
//Space Complexity: O(1)

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for (int i : nums) {
            if (count == 0) {
                candidate = i;
            }
            if (i == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
