class Solution {
    public boolean isAnagram(String s, String t) {
    int [] s1 = new int[26];
    int [] t1 = new int[26];
    int n1 = s.length();
    int n2 = t.length();
    if(n1!=n2) return false;
    for(int i = 0 ; i < n1 ;i++){
        s1[s.charAt(i) - 'a'] += 1;
        t1[t.charAt(i) - 'a'] += 1;
    }
    for(int i = 0 ; i < 26 ; i++){
        if(s1[i] != t1[i] ){
            return false;
        }
    }
    return true;
    }
}
