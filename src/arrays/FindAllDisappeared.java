package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arjun - # varsh007@umn.edu
 * problem- https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 *
 */
public class FindAllDisappeared {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // First Missing Positive way
        List<Integer> list = new ArrayList<Integer>();
        int temp = 0, len = nums.length;
        for( int i = 0; i < len; i++ ) {
            while( nums[i] != i+1 ) {
                if ( nums[i] == nums[nums[i]-1] )
                    break;
                if ( nums[i] != nums[nums[i]-1] ) {
                    temp = nums[nums[i] -1];
                    nums[nums[i] -1] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        for( int i = 0; i < len; i++ ) {
            if( nums[i] != i+1 )
                list.add(i+1);
        }
        return list;
    }
}
