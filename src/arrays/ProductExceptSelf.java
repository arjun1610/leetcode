package arrays;

/**
 * Created by arjun - # varsh007@umn.edu
 * problem- https://leetcode.com/problems/product-of-array-except-self/
 *
 */
public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        int i=0, multiplier =1, len = nums.length ;
        int[] product = new int[len];
        for( i =0 ; i < len ; i++) {
            product[i] = multiplier;
            multiplier *= nums[i];
        }
        multiplier = 1;
        for(i = len-1 ; i>=0; i--) {
            product[i] *= multiplier ;
            multiplier *= nums[i];
        }
        return product;
    }
}
