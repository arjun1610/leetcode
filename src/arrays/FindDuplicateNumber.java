package arrays;

/**
 * Created by arjun - # varsh007@umn.edu
 * problem- https://leetcode.com/problems/find-the-duplicate-number/
 *
 */
public class FindDuplicateNumber {
    public int findDuplicate(int[] nums)
    {
        int len = nums.length, low = 1, high = len-1;

        while( low < high) {
            int mid = low + (high-low)/2;
            int count = 0;
            for( int i = 0; i< len; i++) {
                if(nums[i] <= mid)
                    count += 1;
            }
            if( count <= mid)
                low = mid+1;
            else
                high = mid;
        }
        return low;
    }
    public int findDuplicates_cycle(int[] nums) {

        // http://keithschwarz.com/interesting/code/?dir=find-duplicate
        int len = nums.length, slow = len-1, fast = len-1 , finder = len-1;
        while(true) {
         slow = nums[slow];
         fast = nums[nums[fast]];
         System.out.println("Hello 1" + slow + " " + fast);
         if ( slow == fast )
             break;
        }
        while(true) {
         finder = nums[finder];
         slow = nums[slow];
         if ( slow == finder )
             break;
        }
        return nums[finder];
    }
}
