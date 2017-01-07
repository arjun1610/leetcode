package arrays;

/**
 * Created by arjun - # varsh007@umn.edu
 * problem- https://leetcode.com/problems/merge-sorted-array/
 *
 */
public class MergeTwoSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=m+n;
        while(n > 0) {
            if(m == 0 || nums1[m-1] < nums2[n-1])
                nums1[--k] = nums2[--n];
            else
                nums1[--k] = nums1[--m];
        }
    }
}