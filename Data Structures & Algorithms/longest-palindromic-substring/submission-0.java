class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int idx = -1;
        int maxLen = 0;
        boolean[][] dp = new boolean[n + 1][n + 1];
        for (int L = 1; L <= n; L++) {
            for (int i = 0; i + L - 1 < n; i++) {
                int j = i + L - 1;
                if (i == j) {
                    dp[i][j] = true;
                } else if ((s.charAt(i) == s.charAt(j)) && i + 1 == j) {
                    dp[i][j] = true;
                } else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]);
                }

                if (dp[i][j]) {
                    if (maxLen < j - i + 1) {
                        idx = i;
                        maxLen = j - i + 1;
                    }
                }
            }
        }
        return s.substring(idx, idx + maxLen);
    }
}
