class Solution {
    public int maxProduct(int[] nums) {
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = maxSoFar;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] < 0){
                int temp = minSoFar;
                minSoFar = maxSoFar;
                maxSoFar = temp;
            }

            minSoFar = Math.min(nums[i] , minSoFar * nums[i]);
            maxSoFar = Math.max(nums[i], maxSoFar * nums[i]);
            result = Math.max(maxSoFar , result);
        }
        return result ;
    }
}
