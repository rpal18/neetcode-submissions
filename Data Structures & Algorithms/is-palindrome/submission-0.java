class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            char lChar = s.charAt(left);
            char rChar = s.charAt(right);
            if (!Character.isLetterOrDigit(lChar)) {
                left++;
            }else if (!Character.isLetterOrDigit(rChar)) {
                right--;
            }else if (Character.toLowerCase(lChar) != Character.toLowerCase(rChar)) {
                return false;
            } else {
                left++;
                right--;
            }

            

            
        }
        return true;
    }
}
