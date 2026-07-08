class Solution {
    Integer[] memo;
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0] ;
        }
        memo = new Integer[nums.length + 1];
        int first = fn(nums, 0, nums.length - 2);
        memo = new Integer[nums.length + 1 ];
        int second = fn(nums, 1, nums.length - 1);
        return Math.max(first, second);
    }
    int fn(int[] nums, int index, int stopIndex) {
        if (index > stopIndex) {
            return 0;
        }
        if (memo[index] != null)
            return memo[index];

        int rob = nums[index] + fn(nums, index + 2, stopIndex);
        int leave = fn(nums, index + 1, stopIndex);
        return memo[index] = Math.max(rob, leave);
    }
}
