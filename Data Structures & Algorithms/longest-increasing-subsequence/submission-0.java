class Solution {
    int[][] dp ;
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        dp = new int[n + 1][n + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i ; j >= 0; j--) {
                int pick = 0;
                if ( j == 0 || nums[j - 1] < nums[i]) {
                    pick = 1 + dp[i + 1][i+1];
                }
                int skip = dp[i + 1][j];

                dp[i][j] = Math.max(pick, skip);
            }

        }
        return dp[0][0];
    }
}