import java.util.*;

class Solution {
    
    // Helper function to count subarrays with at most K distinct elements
    private int atMost(int[] nums, int k) {
        int l = 0, count = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int r = 0; r < nums.length; r++) {
            freqMap.put(nums[r], freqMap.getOrDefault(nums[r], 0) + 1);

            while (freqMap.size() > k) {
                freqMap.put(nums[l], freqMap.get(nums[l]) - 1);
                if (freqMap.get(nums[l]) == 0) {
                    freqMap.remove(nums[l]);
                }
                l++;
            }

            count += r - l + 1;
        }

        return count;
    }

    // Main function to return count of subarrays with exactly K distinct integers
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;

        int result = sol.subarraysWithKDistinct(nums, k);
        System.out.println("Number of subarrays with exactly " + k + " distinct integers: " + result);
    }

}