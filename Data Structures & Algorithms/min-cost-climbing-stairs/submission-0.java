class Solution {
    Integer [] memo ; 
    public int minCostClimbingStairs(int[] cost) {
        memo = new Integer[cost.length + 1];
        return Math.min(fn(cost , 0 ) , fn(cost , 1));
        
    }
    int fn(int [] cost , int index){
        if(index >= cost.length){
            return 0;
        }
        if(memo[index]!=null){
            return memo[index];
        }
        int stepOne = cost[index] + fn(cost , index + 1);
        int stepTwo = cost[index] + fn(cost , index + 2);
        
        return memo[index] = Math.min(stepOne , stepTwo);
    }
}