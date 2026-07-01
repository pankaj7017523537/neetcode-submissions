class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLen = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int num : set){
            if(!set.contains(num-1)){
            int curr = num;
            int currLen = 1;

            while(set.contains(curr+1)){
                currLen++;
                curr++;
            }
            maxLen = Math.max(maxLen, currLen);
        }
        }
        return maxLen;
    }
}
