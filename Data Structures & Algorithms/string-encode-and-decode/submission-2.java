

class Solution {
    // Your encode logic is perfect!
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0; // Start from the beginning of the encoded string

        while (i < str.length()) {
            // Find the delimiter '#' starting from index i
            int j = str.indexOf('#', i);
            
            // Extract the length of the upcoming string and convert it to an integer
            int length = Integer.parseInt(str.substring(i, j));
            
            // Move the pointer i past the '#' character
            i = j + 1;
            
            // Extract the actual string using the parsed length
            ans.add(str.substring(i, i + length));
            
            // Move the pointer i to the start of the next encoded block
            i += length;
        }
        
        return ans;
    }
}