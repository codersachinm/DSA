package algorithms.array.hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/

public class TwoSum {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
  }

  public static int[] twoSum(int[] nums, int target) {
    // {3,6} 9
    Map<Integer, Integer> numPositionMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      if (numPositionMap.containsKey(target - nums[i])) {
        return new int[]{numPositionMap.get(target - nums[i]), i};
      }
      numPositionMap.put(nums[i], i);
    }
    return new int[]{};
  }
  /* If array is sorted can use two pointers
  int i = 0, j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                return new int[] {i, j};
            }
        }
        return new int[] { -1, -1 };
    }*/
}
