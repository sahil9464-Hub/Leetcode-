class Solution {
    public String smallestSubsequence(String s) {
        if (s.length() == 0) return "";

        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++){
            last[s.charAt(i) - 'a'] = i;
        }

        int pos = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) < s.charAt(pos)){
                pos = i;
            }
            if (i == last[s.charAt(i) - 'a']){
                break;
            }
        }

        char first = s.charAt(pos);
        String remaining = s.substring(pos + 1).replaceAll("" + first, "");

        return first + smallestSubsequence(remaining);

        
    }
}
