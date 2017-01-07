package arrays;

/**
 * Created by arjun - # varsh007@umn.edu
 * problem- https://leetcode.com/problems/remove-element/
 *
 */
public class RemoveElement {
    public int removeElement_unordered(int[] nums, int val) {
        int len = nums.length, i = 0;
        while (i < len) {
            if (nums[i] == val) {
                nums[i--] = nums[len-- - 1];
            }
            i++;
        }
        return len;
    }

    public int removeElement_ordered(int[] nums, int val) {
        int len = nums.length, i = 0;
        while (i < len) {
            if (nums[i] == val) {
                for (int j = i; j < len - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                len--;
            } else
                i++;
        }
        return len;
    }
}
