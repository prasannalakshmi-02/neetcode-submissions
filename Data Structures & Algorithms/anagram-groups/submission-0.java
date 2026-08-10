class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            int[] freq = new int[26];
            StringBuilder s = new StringBuilder();
            for(int j=0; j<strs[i].length(); j++){
                freq[strs[i].charAt(j)-'a']++;
            }
            for(int fre : freq)s.append("#").append(fre);
            String key = s.toString();
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(key, list);
            }
        }
        res.addAll(map.values());
        return res;
    }
}
