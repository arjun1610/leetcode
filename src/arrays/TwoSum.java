package arrays;

/**
 * Created by arjun - # varsh007@umn.edu
 * problem- https://leetcode.com/problems/two-sum/
 *
 */
import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        if(len <=1 )
            return new int[]{0,0};
        if(len ==2 )
            return new int[]{nums[0], nums[1]};

        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
        for( int i = 0; i< len; i++) {
            if(table.containsKey(target - nums[i]))
                return new int[]{table.get(target-nums[i]),i};
            else
                table.put(nums[i],i);
        }
        return new int[]{0, 0};
    }
    public int[] twoSumNaive(int[] nums, int target){
        int len = nums.length;
        if(len <=1 )
            return new int[]{0,0};
        if(len ==2 )
            return new int[]{nums[0], nums[1]};

        for(int i = 0 ; i< len; i++) {
             int a = nums[i];
             int b = target-nums[i];
             for (int j = i+1; j< len ; j++) {
                 if (nums[j] == b)
                     return new int[]{i,j};
             }
         }
         return new int[]{0, 0};
    }
}