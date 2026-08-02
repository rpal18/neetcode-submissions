class Solution {
    Set<String> set;
    int n ;
    Boolean [] dp ;
    public boolean wordBreak(String s, List<String> wordDict) {
        set = new HashSet<>();
        n = s.length();
        dp = new Boolean[n + 1];
        for(String str : wordDict){
            set.add(str);
        }

        return fn(s , 0);
    }

    boolean fn(String s , int index){
        if(index == n ){
            return true;
        }

        if(dp[index] != null){
            return dp[index];
        }
        

        for(int i = index + 1 ; i <= n ; i++){
            String part = s.substring( index , i);
            if(set.contains(part) && fn(s , i)){
                return dp[index]  = true;
            }
        }
        return dp[index] =  false;
    }
}