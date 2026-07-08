class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0 ;
        int maxSoFar = Integer.MIN_VALUE;
        for(int i : nums){
            currentSum = Math.max(currentSum + i , i );
            maxSoFar = Math.max(maxSoFar , currentSum);
        }
        return maxSoFar;
    }
}
