class Solution {
    public int jump(int[] nums) {
        int n = nums.length ;
        int count = 0 ;
        int rangeEnd = 0 ; 
        int farthest = 0 ;
        for(int i = 0 ; i < n - 1  ; i++){
            farthest = Math.max( i  + nums[i]  , farthest);
            if(i == rangeEnd){
                count++;
                rangeEnd = farthest;
            }
        }
        return count ;
    }
}