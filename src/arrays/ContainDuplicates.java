package arrays;

import java.util.HashSet;
import java.util.Hashtable;
/**
 * Created by arjun - # varsh007@umn.edu
 * problem- https://leetcode.com/problems/contains-duplicate/
 *
 */

public class ContainDuplicates {
    public boolean containsDuplicate_HashTable(int[] nums) {
        Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
        if(nums.length==0)
            return false;
        for(int i=0; i < nums.length; i++) {
            if(h1.get(nums[i]) == null)
                h1.put(nums[i], 1);
            else
                return true;
        }
        return false;
    }
    public boolean containsDuplicate_HashSet(int[] nums) {
        HashSet<Integer> h1 = new HashSet<Integer>();
        for(int i=0; i < nums.length; i++) {
            if(!h1.add(nums[i]))
                return true;
        }
        return false;
    }
}
