class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int count = 0;
        int startElement = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                startElement = nums[i] ;
                int current = startElement;
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
