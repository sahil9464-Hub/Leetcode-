class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer > map = new HashMap<>();

        // Count frequency

        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Sort characters based on frequency
        
        List<Character> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> map.get(b) - map.get(a));

        StringBuilder ans = new StringBuilder();

        // Build answer

        for (char c : list){
            for (int i = 0; i < map.get(c); i++){
                ans.append(c);
            }
        }
        return ans.toString();
    }
}
