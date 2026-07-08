class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int count = 0;
        for (int i : set) {
            if (!set.contains(i - 1)) {
                
                int current = i;
                int local = 0;
                while (set.contains(current)) {
                    local++;
                    current = current + 1;
                }
                count = Math.max(count, local);
            }
        }
        return count;
    }
}
