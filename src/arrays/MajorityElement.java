package arrays;

import java.util.Arrays;

/**
 * Created by arjun - # varsh007@umn.edu
 * problem- https://leetcode.com/problems/majority-element/
 *
 */
public class MajorityElement {
    // 3 ms
    public int majorityElement_sorted(int[] nums) {
            Arrays.sort(nums);
          int len = nums.length;
          return nums[len/2];
    }
    // 2 ms
    public int majorityElement_unsorted(int[] num) {

        int major = num[0], count = 1;
        for (int i = 1; i < num.length; i++) {
            if (count == 0) {
                count++;
                major = num[i];
            } else if (major == num[i]) {
                count++;
            } else count--;
        }
        return major;
    }
}
