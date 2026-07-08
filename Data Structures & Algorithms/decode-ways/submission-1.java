class Solution {
    Integer [] memo ;
    public int numDecodings(String s) {
        if (s.charAt(0) == '0')
            return 0;
        memo = new Integer [s.length() + 1];    
        return fn(s, 0);
    }
    int fn(String s, int index) {
        if (index >= s.length()) {
            return 1;
        }
        if(memo[index] != null) return memo[index];
        int ans = 0;
        // taking one character
        char ch = s.charAt(index);
        if ((ch - '0') > 0) {
            ans = fn(s, index + 1);
        }

        // if taking two character at a time :
        // 1) it should not contains leading 0 . and value between 1 to 26

        if (index < s.length() -1 && (s.charAt(index) != '0')) {
            int firstDigit = s.charAt(index) - '0';
            int num = (firstDigit * 10) + s.charAt(index + 1) - '0';
            if (num < 27 && num > 0) {
                ans = ans + fn(s, index + 2);
            }
        }
        return memo[index] = ans;
    }
}
