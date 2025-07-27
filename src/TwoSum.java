package src;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    // {3,6} 9
    Map< Integer, Integer > numPositionMap = new HashMap< >();

    for (int i = 0; i < nums.length; i++) {
      if (numPositionMap.containsKey(target - nums[i])) {
        return new int[] { numPositionMap.get(target - nums[i]), i };
      }
      numPositionMap.put(nums[i], i);
    }
    return new int[] {};
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
