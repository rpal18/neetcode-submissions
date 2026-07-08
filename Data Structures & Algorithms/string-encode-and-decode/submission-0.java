class Solution {

    public String encode(List<String> strs) {
    // i want to design the algo to encode the string so that by performing some operation I can get it back. 
    // a + 1 => different character , so okay got it .
    //lets take an example : 
    // "Hello" => H + 1 => a different character
    // e + 2 => a different character
    // l + 3 => different character
    // l + 4, o + 5 . 
    // store all this thing into Stringbuilder . and decode accpordingly . 
    // to decode :-
    // get length of string : 
    // for i = 0 to length
    // add it to StringBuider .

    StringBuilder sb = new StringBuilder();
    for(String str : strs){
        sb.append(str.length()).append("#");
        int i = 1 ;
        for(char ch : str.toCharArray()){
          char mch = (char)(ch + i) ;
          i = i + 1;
          sb.append(mch);
        }
    }
    return sb.toString();
    }

    public List<String> decode(String str) {
       List<String> ans = new ArrayList<>();
       int index = 0;
       while (index < str.length()) {
        int hash = str.indexOf("#", index);
        int size = Integer.parseInt(str.substring(index, hash));
        index = hash + 1;
        
        StringBuilder sb = new StringBuilder();
        for(int k = 0; k < size; k++){
         char c = str.charAt(index + k);
         char dch = (char)(c - (k + 1));
         sb.append(dch);
        }
        ans.add(sb.toString());
        index += size;
       }
       return ans;
    }
}