class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();
        for(String s : strs){
            char [] ch = s.toCharArray();
            int [] arr = new int [26];
            for(char c : ch){
                arr[c - 'a']++;
            }
            String key = Arrays.toString(arr);
            map.putIfAbsent(key , new ArrayList<>());
            map.get(key).add(s);
        }
    return new ArrayList<>(map.values());
    }
}
