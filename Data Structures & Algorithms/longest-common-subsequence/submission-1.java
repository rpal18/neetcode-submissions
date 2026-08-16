class Solution {
    int [] dp ; 
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length() ; 
        int m = text2.length() ;
        dp = new int[m + 1];
        for(int i = n -1 ; i >= 0 ; i--){
            int diagonal = 0 ;
            for(int j = m - 1 ; j >= 0 ; j--){
                int temp = dp[j] ; 
                int ans = 0 ;
                if(text1.charAt(i) == text2.charAt(j)){
                    int eq = 1 + diagonal;
                    ans = Math.max(ans , eq);
                }else{
                    int skip1 = dp[j];
                    int skip2 = dp[j + 1];
                    ans = Math.max(ans , Math.max(skip1 , skip2));
                }
                diagonal = temp ; 
                dp[j] = ans;
            }
        }
        return dp[0];
    }
}