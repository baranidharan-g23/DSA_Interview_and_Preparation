class Solution {
   
    
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Update the current sum, either by adding the current element or starting a new subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update the maximum sum found so far
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}