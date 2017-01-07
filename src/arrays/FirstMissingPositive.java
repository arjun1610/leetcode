package arrays;

/**
 * Created by arjun - # varsh007@umn.edu
 * problem- https://leetcode.com/problems/first-missing-positive/
 *
 */

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length, temp = 0;
        for(int i = 0; i < len; i++) {
            // work until the current position is not at the right place
            while( nums[i] != i+1 ) {
                // ignore any non-positive numbers or numbers greater than equal to length
                if( nums[i] <= 0 || nums[i] >= len )
                    break;
                // if the number has already been handled, ignore. for example duplicates
                if( nums[i] == nums[nums[i]-1] )
                    break;
                // otherwise, swap
                if( nums[i] != nums[nums[i]-1] ) {
                    temp = nums[nums[i] -1];
                    nums[nums[i] -1] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        for ( int i = 0; i < len; i++ ) {
            if( nums[i] != i+1 )
                return (i+1);
        }
        return len+1;
    }

    public static void main(String args[]) {
        int[] nums = {3,4,-1,1};
        FirstMissingPositive missingPositive = new FirstMissingPositive();
        System.out.println(missingPositive.firstMissingPositive(nums));
    }
}
