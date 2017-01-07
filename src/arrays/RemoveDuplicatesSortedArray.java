package arrays;

/**
 * Created by arjun - # varsh007@umn.edu
 * problem- https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 */
public class RemoveDuplicatesSortedArray {

    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]!=nums[i-1]) {
                nums[j++]=nums[i];
            }
        }
        return j;
    }
    public static void main(String args[]) {

        int[] nums = {1,2,2,3,3,4,4,4};
        RemoveDuplicatesSortedArray sortedArray = new RemoveDuplicatesSortedArray();
        System.out.print(sortedArray.removeDuplicates(nums));
    }
}
