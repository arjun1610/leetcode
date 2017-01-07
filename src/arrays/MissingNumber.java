package arrays;

/**
 * Created by arjun - # varsh007@umn.edu
 * problem- https://leetcode.com/problems/missing-number/
 *
 */
public class MissingNumber {
    public int missingNumber_Sum(int[] nums) {
        int sum1 = 0, sum2 = 0, len = nums.length;
        for (int i = 0; i < len; i++)
            sum1 += nums[i];
        return len * (len + 1) / 2 - sum1;
    }

    public int missingNumber_XOR(int[] nums) {
        int sum1 = 0, sum2 = 0, len = nums.length;

        for (int i = 0; i < len; i++)
            sum1 ^= nums[i];
        for (int i = 0; i <= len; i++)
            sum2 ^= i;
        return sum1 ^ sum2;

    }
}
