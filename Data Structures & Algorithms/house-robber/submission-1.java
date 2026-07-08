class Solution {
    Integer [] memo ;
    public int rob(int[] nums) {
        memo = new Integer[nums.length + 1];
       return fn(nums  , 0 ); 
    }
    int fn(int [] nums , int index){
        if(index >= nums.length){
            return 0;
        }
        if(memo[index] != null) return memo[index];

        int rob = nums[index] + fn(nums , index + 2);
        int leave = fn(nums , index + 1);
        return memo[index] = Math.max(rob , leave);
    }
}
