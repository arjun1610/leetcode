package arrays;

/**
 * Created by arjun - # varsh007@umn.edu
 * problem- https://leetcode.com/problems/move-zeroes/
 *
 */
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int i=0, j=-1;
        while(i<nums.length)
        {
            if(nums[i]!=0)
            {
                int temp=nums[++j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
            i++;
        }
    }
}