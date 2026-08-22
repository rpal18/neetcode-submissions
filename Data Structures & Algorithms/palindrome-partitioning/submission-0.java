class Solution {
    List<List<String>> ans = new ArrayList<>();
    boolean[][] dp ;
    public List<List<String>> partition(String s) {
        int n = s.length();
        dp = new boolean[n + 1][n + 1];
        for (int L = 1; L <= n; L++) {
            for (int i = 0; i + L - 1 < n; i++) {
                int j = i + L - 1;
                if (i == j) {
                    dp[i][j] = true;
                } else if (s.charAt(i) == s.charAt(j) && i + 1 == j) {
                    dp[i][j] = true;
                } else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]);
                }
            }
        }
        fn(s, new ArrayList<>(), 0);
        return ans;
    }

    void fn(String s, List<String> current, int index) {
        int n = s.length();
        if (index == n) {
            ans.add(new ArrayList<>(current));
        }
        for (int j = index; j < n; j++) {
            if (dp[index][j]) {
                current.add(s.substring(index, j + 1));
                fn(s, current, j + 1);
                current.remove(current.size() - 1);
            }
        }
    }
}
