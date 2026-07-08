class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        List<Integer>[] bucket = new List[n + 1];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }
        for (int key : map.keySet()) {
            int dest = map.get(key);
            bucket[dest].add(key);
        }
        // need to find out top k elements
        int[] ans = new int[k];
        int j = 0;
        for (int i = bucket.length - 1; i >= 1; i--) {
            if (!bucket[i].isEmpty()) {
                for (int num : bucket[i]) {
                    ans[j++] = num;
                }
            }
            if (j == k) {
                break;
            }
        }
        return ans;
    }
}
