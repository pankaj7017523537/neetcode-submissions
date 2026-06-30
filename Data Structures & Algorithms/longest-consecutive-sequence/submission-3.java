class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int currLen = 1;
        int maxLen = 1;
        if(nums.length <= 0) return 0;
        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i-1]) continue;
            int diff = Math.abs(nums[i]-nums[i-1]);
            if (nums[i] == nums[i - 1] + 1) {
               currLen++;              // Extend current sequence
            } else {
               currLen = 1;            // Start a new sequence
            }
            maxLen = Math.max(maxLen, currLen);
        }
        return maxLen;
    }
}
