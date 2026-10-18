class Solution {
    public int numTilePossibilities(String tiles) {
        int[] freq = new int[26];

        for(char ch : tiles.toCharArray()){
            freq[ch - 'A']++;
        }
        return count(freq);
    }

    private int count(int[] freq){
        int ans = 0;

        for(int i = 0;i < freq.length;i++){
            if(freq[i] == 0)continue;

            ans++;
            freq[i]--;

            ans += count(freq);
            freq[i]++;
        }
        return ans;
    }
}
