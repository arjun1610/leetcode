package arrays;

/**
 * Created by arjun - # varsh007@umn.edu
 * problem- https://leetcode.com/problems/subarray-sum-equals-k/
 *
 */
public class SubArraySumEqualsK {
    
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> prefixMap = new HashMap<Integer, Integer>();
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) count++;
            if (prefixMap.containsKey(sum-k)) count+= prefixMap.get(sum-k);
            if (!prefixMap.containsKey(sum)) {
                prefixMap.put(sum, 1);
            } else {
                prefixMap.put(sum, prefixMap.get(sum)+1);
            }
        }
        return count;
     }
}