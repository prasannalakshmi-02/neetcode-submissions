class Solution {
    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s.length()).append("#").append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
       List<String> result = new ArrayList<>();
       int i = 0;
       while (i < str.length()) {
        int len = 0;
        while (str.charAt(i) != '#') {
            len = len * 10 + (str.charAt(i) - '0');
            i++;
        }
        i++; 
        StringBuilder s = new StringBuilder();
        for (int j = 0; j < len; j++) {
            s.append(str.charAt(i));
            i++;
        }
        result.add(s.toString());
    }
      return result;
   }
}
