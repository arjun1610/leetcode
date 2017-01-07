package arrays;

import java.util.Hashtable;

/**
 * Created by arjun - # varsh007@umn.edu
 * problem- https://leetcode.com/problems/contains-duplicate-ii/
 *
 */
public class NearByDuplicates {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Hashtable<Integer, Integer> h1 = new Hashtable<>();
        if(k==0)
            return false;
        for(int i=0;i<nums.length;i++) {
            if(h1.containsKey(nums[i]) && i - h1.get(nums[i]) <= k)
                return true;
            else
                h1.put(nums[i],i);
        }
        return false;
    }
}
