class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
         PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        
        // Step 3: Maintain exactly K elements in the heap
        for (int key : map.keySet()) {
            minHeap.add(key);
            if (minHeap.size() > k) {
                minHeap.poll(); // Evicts the least frequent element
            }
        }
        
        // Step 4: Extract elements from the heap into the output array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }
        
        return result;
    }
}
