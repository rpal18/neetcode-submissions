class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return fn(nums , target , 0 , 0 );
    }
    int fn(int [] nums , int target ,  int sum , int index ){
    

        if(index == nums.length ) {
            if( sum == target ) return 1;
            return 0 ; 
        }
        int left = fn(nums , target ,   sum + (-1 * nums[index]) , index + 1);
        int right = fn(nums , target ,  sum + nums[index] ,index + 1 );
        return  left + right ;
    }
}